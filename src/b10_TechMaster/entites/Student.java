package b10_TechMaster.entites;

public class Student {
    private int id;
    private String name;
    private int age;
    private String rank;

    private static int autoId;
    public Student() {
        this.id=++autoId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", rank='" + rank + '\'' +
                ", autoId=" + autoId +
                '}';
    }

}
