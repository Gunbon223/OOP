package bai8_Lol;

import bt_tiktok.Main;
import bt_tiktok.Songs;

import java.util.ArrayList;

public class Team {
    ArrayList<Champion> championList = new ArrayList<>();
    private String player;



    public Team(ArrayList<Champion> championList, String player) {
        this.championList = championList;
        this.player = player;
    }

    public Team() {
    }

    public ArrayList<Champion> addChampion() {
        ArrayList<Champion> champions = new ArrayList<>();
            Champion champion = new Champion();
            System.out.print("Nhap ten tuong cua player"  +": ");
            champion.setName(Main.scan.nextLine());
            System.out.print("Nhap vi tri cua player"  +": ");
            champion.setPosition(Main.scan.nextLine());
            champions.add(champion);
        return champions;
    }

    @Override
    public String toString() {
        return  "Ten tuyen thu: " + player +
                ", su dung: " + championList +"\n";
    }

    public ArrayList<Champion> getChampionList() {
        return championList;
    }

    public void setChampionList(ArrayList<Champion> championList) {
        this.championList = championList;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }
}
