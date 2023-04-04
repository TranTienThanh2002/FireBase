package hcmute.edu.vn.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
EditText txtname,txtage, txtphone, txthight;
Button btnsave;

DatabaseReference reff;
Member member;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtname=findViewById(R.id.txtname);
        txtage=findViewById(R.id.txtage);
        txthight=findViewById(R.id.txthight);
        txtphone=findViewById(R.id.txtphone);
        btnsave = findViewById(R.id.btnsave);
        member = new Member();
        reff = FirebaseDatabase.getInstance().getReference().child("Member");

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int age = Integer.parseInt(txtage.getText().toString().trim());
                Float hit = Float.parseFloat((txthight.getText().toString().trim()));
                Long phn = Long.parseLong(txtphone.getText().toString().trim());
                member.setName(txtname.getText().toString());
                member.setAge(age);
                member.setHt(hit);
                member.setPh(phn);
                reff.push().setValue(member);
                Toast.makeText(MainActivity.this, "data insert succsescfully", Toast.LENGTH_LONG).show();
            }
        });
    }
}