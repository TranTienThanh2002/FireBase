package hcmute.edu.vn.playaudiosongfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play_song(View v){
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/ltdd-aba88.appspot.com/o/N%E1%BB%97i%20Nh%E1%BB%9B%20T%E1%BB%B1a%20Thi%C3%AAn%20H%C3%A0-%E6%89%80%E5%BF%B5%E7%9A%86%E6%98%9F%E6%B2%B3(D.C%200%202%200%203)%20Nh%E1%BA%A1c%20Bu%C3%B4ng%20T%C3%A2m%20Tr%E1%BA%A1ng%20Kh%C3%B4ng%20L%E1%BB%9Di.mp3?alt=media&token=1f9c6ac7-0804-444c-b41c-038ccc39d5f6");
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });
            mediaPlayer.prepare();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}