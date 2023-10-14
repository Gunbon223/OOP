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

    public double getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(double javaScore) {
        this.javaScore = javaScore;
    }

    public double getHtmlScore() {
        return htmlScore;
    }

    public void setHtmlScore(double htmlScore) {
        this.htmlScore = htmlScore;
    }

    public double getCssScore() {
        return cssScore;
    }

    public void setCssScore(double cssScore) {
        this.cssScore = cssScore;
    }

    public void display() {
        System.out.println("Sinh vien "+getName()+" hoc "+getMajor()+ " co diem: "+getScore()+ "diem java:"+getJavaScore()+ getHtmlScore()+ getCssScore()+" GPA: "+getGpa());
    }



}
