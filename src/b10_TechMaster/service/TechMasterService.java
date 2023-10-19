package b10_TechMaster.service;

import b10_TechMaster.entites.Techmaster;

import java.util.Scanner;

public class TechMasterService {
    public static Scanner scan = new Scanner(System.in);
    public void inputTechmaster(Techmaster techmaster) {

        System.out.println("Nhap ten manager: ");
        techmaster.setManagerName(scan.nextLine());
        System.out.println("Nhap ten giao vien: ");
        techmaster.setTeacherName(scan.nextLine());

        ClassroomService classroom_service = new ClassroomService();
        techmaster.setClassroom(classroom_service.inputClassroom());
    }


}
