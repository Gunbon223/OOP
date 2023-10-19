package b9_bvn01;

import b9_bvn01.entities.Student;
import b9_bvn01.service.StudentService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student>  studentArrayList = new ArrayList<>();
        StudentService service = new StudentService();
        service.inputList(studentArrayList);
        System.out.println(studentArrayList);
    }
}
