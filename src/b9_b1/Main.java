package b9_b1;

import b9_b1.entities.Student;
import b9_b1.service.StudentService;
import b9_b1.service.StundentService_b2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StundentService_b2 studentservice2 = new StundentService_b2();
        ArrayList<Student> studentList = new ArrayList<>();
        studentservice2.inputScoreList(studentList);

        for(Student i :studentList) {
            System.out.println(i);
        }

        studentservice2.rankStudentPercent(studentList);

    }
}
