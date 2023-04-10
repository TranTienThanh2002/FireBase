package hcmute.edu.vn.uploadvideotofirebase;


public class Member {
    private String name;
    private String Videouri;
    private String search;

    public Member() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideouri() {
        return Videouri;
    }

    public void setVideouri(String videouri) {
        Videouri = videouri;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
