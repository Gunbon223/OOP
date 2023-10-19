package b9_bvn01.service;

import b9_bvn01.entities.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public static Scanner scan = new Scanner(System.in);
    private ArrayList<Student> studentList;

    public ArrayList<Student> inputList(ArrayList<Student> students) {
        String choice ="";
        do {
                students.add(input());
            System.out.println("Ban co muon nhap lai y/n: ");
            choice = scan.nextLine();
        }
        while (choice.equalsIgnoreCase("y"));
        return students;
    }

    public Student input() {
        Student student = new Student();
        System.out.print("Nhap ten cua hs: ");
        student.setName(scan.nextLine());
        System.out.print("Nhap dia chi cua hs: " );
        student.setAddress(scan.nextLine());
        return student;
    }
}


