package bvn6;

public class IT_Student extends StudentTechMaster{
    private double javaScore;
    private double htmlScore;
    private double cssScore;

    public IT_Student(String name ,double javaScore, double htmlScore, double cssScore) {
        super(name);
        this.javaScore = javaScore;
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
        setMajor("IT");
    }

    @Override
    public double getScore() {
        return (2*javaScore+htmlScore+cssScore)/4;
    }

    @Override
    public String getGpa() {
        if (getScore()<5) {
            return "Yeu";
        }
        if(getScore()>=5&&getScore()<6.5) {
            return "Trung binh";
        }
        if(getScore()>=6.5&&getScore()<7.5) {
            return "Kha";
        }
        if (getScore()>=7.5&&getScore()<=10) {
            return "Gioi";

        }
        return "Error ";
    }



}
