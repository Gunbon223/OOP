package b10_TechMaster.entites;

public class Techmaster {
    private String teacherName;
    private String managerName;
    private Classroom classroom;

    public Techmaster() {
    }

    @Override
    public String toString() {
        return "Techmaster{" +
                "teacherName='" + teacherName + '\'' +
                ", managerName='" + managerName + '\'' +
                ", classroom=" + classroom +
                '}';
    }


    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }


}
