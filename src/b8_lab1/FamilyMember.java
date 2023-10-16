package b8_lab1;

import java.time.LocalDate;
import java.util.ArrayList;

import static b8_lab1.Main.scan;

public class FamilyMember {
    private int id;
    private String name;
    private LocalDate dob;
    private String job;

    @Override
    public String toString() {
        return "FamilyMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public FamilyMember(int id, String name, LocalDate dob, String job) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.job = job;
    }

    public void display() {
        System.out.println( "FamilyMember: " +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", job='" + job + '\''
                );
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
