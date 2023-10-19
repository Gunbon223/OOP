package b9_bvn2;

import b9_bvn2.entities.Student;
import b9_bvn2.service.StundentService2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StundentService2 studentservice2 = new StundentService2();
        ArrayList<Student> studentList = new ArrayList<>();
        studentservice2.inputScoreList(studentList);
        for(Student i :studentList) {
            System.out.println(i);
        }
        studentservice2.rankStudentPercent(studentList);
    }
}
