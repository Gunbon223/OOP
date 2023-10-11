package bvn6_2;

public class Person {
    private String ten;
    private int tuoi;

    public Person(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return
                "ten: " + ten  +
                ",   tuoi = " + tuoi +
                ' ';
    }
}
