package bai8_Lol;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Match finalMatch = new Match();
        System.out.print("Nhap thoi gian bat dau tran dau(\"dd/MM/yy\"): ");
        String matchStartTime = scan.nextLine();
        finalMatch.setMatchStartTime(LocalDate.parse(matchStartTime,
                DateTimeFormatter.ofPattern("dd/MM/yy")));
        System.out.println("Nhap thong tin team 1");
        finalMatch.setTeam1(finalMatch.addTeamToMatch());
        System.out.println("Nhap thong tin team 2");
        finalMatch.setTeam2(finalMatch.addTeamToMatch());
        System.out.println(finalMatch.toString());
    }
}
