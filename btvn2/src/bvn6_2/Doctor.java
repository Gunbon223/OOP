package bvn6_2;

import javax.sql.rowset.serial.SerialStruct;

public class Doctor extends Person{
    private String specialistIn;
    private double workHour;

    public Doctor(String ten, int tuoi, String specialistIn, double workHour) {
        super(ten, tuoi);
        this.specialistIn = specialistIn;
        this.workHour = workHour;
    }

    public String displayInfo() {
        return "\nLa Doctor\n" +
                "specialistIn= " + specialistIn  +
                ",    workHour= " + workHour ;
    }
}
