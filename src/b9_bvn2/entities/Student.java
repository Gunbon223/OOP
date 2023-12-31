package b9_bvn2.entities;

public class Student {
    private static int autoId;
    private int id;
    private String name;
    private String rank;

    public Student() {
        this.id = ++autoId;

    }


    public void setRank(String rank) {
        this.rank = rank;
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


    //b2
    private double scoreMath;
    private double scorePhysic;
    private double scoreChemistry;

    public String getRank() {
        return rank;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScorePhysic() {
        return scorePhysic;
    }

    public void setScorePhysic(double scorePhysic) {
        this.scorePhysic = scorePhysic;
    }

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(double scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", scoreMath=" + scoreMath +
                ", scorePhysic=" + scorePhysic +
                ", scoreChemistry=" + scoreChemistry +
                '\n'+"AVG Score: "+ getRank();
    }

    public String getAvgScore() {
        double avgScore = (scoreMath+scorePhysic+scoreChemistry)/3;
        if (avgScore >=8 &&avgScore<10) {
            return "Xep loai A";
        }
        if (avgScore <8 &&avgScore>=6.5) {
            return "Xep loai B";
        }
        if (avgScore >0 &&avgScore<6.5) {
            return "Xep loai C";
        }
        return "Nhap sai diem, nhap lai";
    }
}
