package bvn6_2;

import java.util.Date;

public class Patient extends Person{
    private int patientID;
    private String timeCheckIn;

    public Patient(String ten, int tuoi, int patientID, String timeCheckIn) {
        super(ten, tuoi);
        this.patientID = patientID;
        this.timeCheckIn = timeCheckIn;
    }

    public String displayInfo() {
        return "\nLa Patient\n" +
                "patientID=" + patientID +
                ",   timeCheckIn= " + timeCheckIn ;
    }


}
