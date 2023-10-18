package bai8_Lol.service;

import bai8_Lol.entities.Champion;
import bt_tiktok.Main;

import java.util.ArrayList;

public class ChampionService {


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


}
