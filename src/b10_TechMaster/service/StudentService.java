package b10_TechMaster.service;

import b10_TechMaster.entites.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public static Scanner scan = new Scanner(System.in);

    public void addStudent(ArrayList<Student> students) {
        String choice = "";
        do {
            Student student = new Student();
            System.out.print("Nhap ten hoc sinh: ");
            student.setName(ClassroomService.scan.nextLine());
            System.out.print("Nhap tuoi hoc sinh: ");
            student.setAge(Integer.parseInt(ClassroomService.scan.nextLine()));
            System.out.print("Nhap hoc luc hoc sinh: ");
            student.setRank(ClassroomService.scan.nextLine());
            students.add(student);
            System.out.println("Nhap them hs khong(y/n): ");
            choice = ClassroomService.scan.nextLine();
        }
        while (choice.equalsIgnoreCase("y"));
    }


        public void delete(ArrayList<Student> students) {
            System.out.print("Nhap id hs muon xoa: ");
            int deletedId = Integer.parseInt(scan.nextLine());
            for (Student s: students) {
                if (s.getId()==deletedId) {
                    students.remove(s);
                    break;
                }
            }
        }

        public void updaterank(ArrayList<Student> students) {
            System.out.print("Nhap id hs muon update: ");
            int updatedId = Integer.parseInt(scan.nextLine());
            for (Student s: students) {
                if (s.getId()==updatedId) {
                    System.out.print("Nhap rank moi cua hs: ");
                    s.setRank(scan.nextLine());
                    break;
                }
            }
        }

    }



