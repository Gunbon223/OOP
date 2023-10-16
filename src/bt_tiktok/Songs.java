package bt_tiktok;

public class Songs {
private int id;
private String name;
private String singer;

    public Songs(int id, String name, String singer) {
        this.id = id;
        this.name = name;
        this.singer = singer;
    }

    public Songs() {
    }

    @Override
    public String toString() {
        return "Songs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
