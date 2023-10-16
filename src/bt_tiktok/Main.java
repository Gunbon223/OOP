package bt_tiktok;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Tiktok tiktok = new Tiktok();
        tiktok.setIdolList(tiktok.addIdolToList());
        tiktok.setSongList(tiktok.addSongToList());
        tiktok.display();

    }
}

