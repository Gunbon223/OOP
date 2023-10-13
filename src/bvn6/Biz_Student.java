package bvn6;

public class Biz_Student extends StudentTechMaster{
    private double marketingScore;
    private double salesScore;


    public Biz_Student(String name, double marketingScore, double salesScore) {
        super(name);
        this.marketingScore = marketingScore;
        this.salesScore = salesScore;
        setMajor("Biz");
    }

    @Override
    public double getScore() {
        return (2*marketingScore + salesScore)/3 ;
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
        return "";
    }


}
