package b9_bvn2.service;

import b9_bvn2.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StundentService2 {
    public  Scanner scan = new Scanner(System.in);
    public double avgScore;



    public void inputScoreList(ArrayList<Student> students) {
        String choice ="";
        do {
        Student student = new Student();
        System.out.print("Nhap ten cua hs: ");
        student.setName(scan.nextLine());
        System.out.print("Nhap diem toan cua hs: " );
        student.setScoreMath(Double.parseDouble(scan.nextLine()));
        System.out.print("Nhap diem ly cua hs: " );
        student.setScorePhysic(Double.parseDouble(scan.nextLine()));
        System.out.print("Nhap diem hoa cua hs: " );
        student.setScoreChemistry(Double.parseDouble(scan.nextLine()));
        student.setRank(student.getAvgScore());
        students.add(student);
            System.out.println("Ban co muon nhap lai y/n: ");
            choice = scan.nextLine();
        }
        while (choice.equalsIgnoreCase("y"));

    }
    public void rankStudentPercent(ArrayList<Student> students) {
        double countA=0,countB=0,countC=0;
        for (Student i : students) {
            if(i.getRank().equalsIgnoreCase("Xep loai A")) {
                countA++;
            }
            if(i.getRank().equalsIgnoreCase("Xep loai B")) {
                countB++;
            }
            if(i.getRank().equalsIgnoreCase("Xep loai C")) {
                countC++;
            }
        }
            double studentSum =students.size();
        System.out.println(countA+countB+countC);
            System.out.println("So hs A: "+ countA/studentSum*100+"%\n"+
                    "So hs B: "+ countB/studentSum*100+"%\n"+
                    "So hs C: "+ countC/studentSum*100+"%\n");
    }

}
