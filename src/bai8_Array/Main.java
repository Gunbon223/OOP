package bai8_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> score = new ArrayList<>();
        List<String> score2 = new ArrayList<>(Arrays.asList("1","3"));
        System.out.println("Nhap ptu: ");
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for(int i=0;i<n;i++) {
            System.out.println("Nhap ptu thu "+ i+" ");
            score.add(Double.parseDouble(scan.nextLine()));
        }
        for (Double i:
             score) {
            System.out.println(i);
        }


    }
}
