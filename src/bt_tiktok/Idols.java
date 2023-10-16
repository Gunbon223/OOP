package bt_tiktok;

import java.util.ArrayList;

public class Idols {
    private String name;
    private int id;
    private String email;
    ArrayList<Followers> fanGroup;

    public Idols() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Followers> getFanGroup() {
        return fanGroup;
    }

    public void setFanGroup(ArrayList<Followers> fanGroup) {
        this.fanGroup = fanGroup;
    }

    public Idols(String name, int id, String email, ArrayList<Followers> fanGroup) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.fanGroup = fanGroup;
    }
    public int input() {
        System.out.println("Nhap so luong followers :");
        int n = Integer.parseInt(Main.scan.nextLine());
        return n;
    }
    public ArrayList<Followers> addFollowerList() {
        int n = input();
        ArrayList<Followers> followers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Followers follower = new Followers();
            System.out.print("Nhap id fangroup thu " +(i+1) +": ");
            follower.setId(Integer.parseInt(Main.scan.nextLine()));
            System.out.print("Nhap so luot like: ");
            follower.setNumberOfLike(Integer.parseInt(Main.scan.nextLine()));
            System.out.print("Nhap ten fangroup thu " +(i+1) +": ");
            follower.setName(Main.scan.nextLine());
            System.out.print("Nhap email fangroup thu " +(i+1) +": ");
            follower.setEmail(Main.scan.nextLine());
            followers.add(follower);
        }
        return followers;
    }

    @Override
    public String toString() {
        return "Idols{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", fanGroup=" + fanGroup +
                '}';
    }
}
