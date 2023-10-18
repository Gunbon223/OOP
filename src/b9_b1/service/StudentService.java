package b9_b1.service;

import b9_b1.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public static Scanner scan = new Scanner(System.in);
    private ArrayList<Student> studentList;

    public ArrayList<Student> inputList(ArrayList<Student> students) {
        String choice ="";
        do {
                Student student = new Student();
                System.out.print("Nhap ten cua hs: ");
                student.setName(scan.nextLine());
                System.out.print("Nhap dia chi cua hs: " );
                student.setAddress(scan.nextLine());
                students.add(student);

            System.out.println("Ban co muon nhap lai y/n: ");
            choice = scan.nextLine();
        }
        while (choice.equalsIgnoreCase("y"));
        return students;
    }

}
