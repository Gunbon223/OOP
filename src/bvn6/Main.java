package bvn6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<StudentTechMaster> stundents = new ArrayList<>();

        System.out.println("Nhap so hoc sinh: ");
        int n = Integer.parseInt(scan.nextLine());
        for(int i=0;i<n;i++) {
            System.out.print("Nhap ten: ");
            String name = scan.nextLine();
            System.out.print("Nhap diem Java: ");
            double javaScore = Double.parseDouble(scan.nextLine());
            System.out.print("Nhap diem Html: ");
            double htmlScore = Double.parseDouble(scan.nextLine());
            System.out.print("Nhap diem CSS: ");
            double cssScore = Double.parseDouble(scan.nextLine());
            StudentTechMaster newStudent = new IT_Student(name, javaScore, htmlScore, cssScore);
            stundents.add(newStudent);
        }

        for (StudentTechMaster i:
             stundents) {
            i.display();
        }

        }

    }

