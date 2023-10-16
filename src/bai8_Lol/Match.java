package bai8_Lol;

import bt_tiktok.Main;

import java.time.LocalDate;
import java.util.ArrayList;

public class Match {
    ArrayList<Team> team1 = new ArrayList<>();
    ArrayList<Team> team2 = new ArrayList<>();
    LocalDate matchStartTime;

    public ArrayList<Team> addTeamToMatch() {
        ArrayList<Team> teams = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Team team = new Team();
            System.out.print("Nhap ten player thu " +(i+1) +": ");
            team.setPlayer(Main.scan.nextLine());
            team.setChampionList(team.addChampion());
            teams.add(team);
        }
        return teams;
    }

    @Override
    public String toString() {
        return "Match\n" +
                "danh sach team 1:\n" + team1 + "\n"+
                "danh sach team 2:\n" + team2 +"\n"+
                " matchStartTime=" + matchStartTime
                ;
    }

    public Match(ArrayList<Team> team1, ArrayList<Team> team2, LocalDate matchStartTime) {
        this.team1 = team1;
        this.team2 = team2;
        this.matchStartTime = matchStartTime;
    }

    public ArrayList<Team> getTeam1() {
        return team1;
    }

    public void setTeam1(ArrayList<Team> team1) {
        this.team1 = team1;
    }

    public ArrayList<Team> getTeam2() {
        return team2;
    }

    public void setTeam2(ArrayList<Team> team2) {
        this.team2 = team2;
    }

    public LocalDate getMatchStartTime() {
        return matchStartTime;
    }

    public void setMatchStartTime(LocalDate matchStartTime) {
        this.matchStartTime = matchStartTime;
    }

    public Match() {
    }

}
