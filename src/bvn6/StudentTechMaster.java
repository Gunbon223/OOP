package bvn6;

public abstract class StudentTechMaster {
    private String name;
    private String major;

    public StudentTechMaster(String name) {
        this.name = name;
    }

    public abstract double getScore();
    public abstract String  getGpa();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
        public void display() {
            System.out.println("Sinh vien "+getName()+" hoc "+getMajor()+ " co diem: "+getScore()+" GPA: "+getGpa());
        }

}
