package bvn6;

public class Main {
    public static void main(String[] args) {
        StudentTechMaster[] studentList = new StudentTechMaster[4];
        studentList[0]  = new IT_Student("Court",4,5,10);
        studentList[1] = new Biz_Student("Jordan",10,9);
        studentList[3] = new Biz_Student("Air Force",7.5,6);
        studentList[2]  = new IT_Student("Legacy",1,1,2);
        for(StudentTechMaster i : studentList) {
            i.display();
        }



    }
}
