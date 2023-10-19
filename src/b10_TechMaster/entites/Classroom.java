package b10_TechMaster.entites;

import java.util.ArrayList;

public class Classroom {
    private String subject;
    private ArrayList<Student> students = new ArrayList<>();


    public Classroom() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "subject='" + subject + '\'' +
                ", students=" + students +
                '}';
    }


}
