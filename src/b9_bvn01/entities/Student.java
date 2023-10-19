package b9_bvn01.entities;

public class Student {
    private static int autoId;
    private int id;
    private String name;
    private String address;

    public Student() {
        this.id = ++autoId;
    }

    public String toString() {
        return "Student " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +"\n"
                ;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }




}
