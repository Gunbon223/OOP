package bai8_Lol.entities;

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
