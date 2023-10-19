package b10_TechMaster.service;



import b10_TechMaster.entites.Classroom;

import java.util.Scanner;



public class ClassroomService {
    public static Scanner scan = new Scanner(System.in);

    public ClassroomService() {
    }

    public Classroom inputClassroom() {
        Classroom classroom = new Classroom();
        System.out.println("Nhap ten mon hoc: ");
        classroom.setSubject(scan.nextLine());

        StudentService service = new StudentService();
        service.addStudent(classroom.getStudents());
        return classroom;
    }


}
