package bai8_Lol.service;

import bai8_Lol.entities.Team;
import bt_tiktok.Main;

import java.util.ArrayList;

public class TeamService {
    public ArrayList<Team> addTeamToMatch() {
        ArrayList<Team> teams = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Team team = new Team();
            ChampionService champsv = new ChampionService();
            System.out.print("Nhap ten player thu " +(i+1) +": ");
            team.setPlayer(Main.scan.nextLine());
            team.setChampionList(champsv.addChampion());
            teams.add(team);
        }
        return teams;
    }

}
