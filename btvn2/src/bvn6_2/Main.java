package bvn6_2;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Lopaz",30,"Noi",1200);
        System.out.println(doctor1+doctor1.displayInfo());
        Patient patient2 = new Patient("zasd",10,002,"13/4/2011");
        System.out.println(patient2+patient2.displayInfo());
    }
}
