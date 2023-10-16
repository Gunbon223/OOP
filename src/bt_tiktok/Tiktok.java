package bt_tiktok;

import java.util.ArrayList;

public class Tiktok {
    ArrayList<Songs> songList;
    ArrayList<Idols>  idolList;

    public void setSongList(ArrayList<Songs> songList) {
        this.songList = songList;
    }

    public void setIdolList(ArrayList<Idols> idolList) {
        this.idolList = idolList;
    }

    public ArrayList<Songs> getSongList() {
        return songList;
    }

    public ArrayList<Idols> getIdolList() {
        return idolList;
    }
    public int input() {
        System.out.println("Nhap so luong idol(truoc) & bai hat(sau) ban muon tao");
        int n = Integer.parseInt(Main.scan.nextLine());
        return n;
    }
    public void display() {
        System.out.println("Danh sach idol");
        int count =1;
        for (Idols i : getIdolList()) {
            System.out.println("Idol thu " + count +"\n" +
                    i.toString());
            count++;
        }
        System.out.println("Danh sach bai hat");
        count =1;
        for (Songs i : getSongList()) {
            System.out.println("Bai hat thu " + count +"\n" +
                    i.toString());
            count++;
        }
    }

    @Override
    public String toString() {
        return "Tiktok{" +
                "songList=" + songList +
                ", idolList=" + idolList +
                '}';
    }

    public ArrayList<Songs> addSongToList() {
        int n = input();
        ArrayList<Songs> songs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Songs song = new Songs();
            System.out.print("Nhap id bai hat thu " +(i+1) +": ");
            song.setId(Integer.parseInt(Main.scan.nextLine()));
            System.out.print("Nhap ten bai hat thu " +(i+1) +": ");
            song.setName(Main.scan.nextLine());
            System.out.print("Nhap ten ca si bai hat thu " +(i+1) +": ");
            song.setSinger(Main.scan.nextLine());
            songs.add(song);
        }
        return songs;
    }

    public ArrayList<Idols> addIdolToList() {
        int n = input();
        ArrayList<Idols> idols = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Idols idol = new Idols();
            System.out.print("Nhap id idol thu " +(i+1) +": ");
            idol.setId(Integer.parseInt(Main.scan.nextLine()));
            System.out.print("Nhap ten idol thu " +(i+1) +": ");
            idol.setName(Main.scan.nextLine());
            System.out.print("Nhap email idol thu " +(i+1) +": ");
            idol.setEmail(Main.scan.nextLine());
            System.out.print("Nhap fangroup idol thu " +(i+1) +": ");
            idol.setFanGroup(idol.addFollowerList());
            idols.add(idol);
        }
        return idols;
    }
}
