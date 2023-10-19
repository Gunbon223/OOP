package b10_TechMaster;

import b10_TechMaster.entites.Techmaster;
import b10_TechMaster.service.StudentService;
import b10_TechMaster.service.TechMasterService;

public class Main {


    public static void main(String[] args) {
        Techmaster techmaster = new Techmaster();
        TechMasterService service = new TechMasterService();
        service.inputTechmaster(techmaster);
        System.out.println(techmaster);
        StudentService student_service = new StudentService();
        student_service.delete(techmaster.getClassroom().getStudents());
        student_service.updaterank(techmaster.getClassroom().getStudents());
        System.out.println(techmaster);

        //them menu, do while
    }

}
