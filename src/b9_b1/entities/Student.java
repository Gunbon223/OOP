package b9_b1.entities;

public class Student {
    private static int autoId;
    private int id;
    private String name;
    private String address;
    private String rank;

    public Student() {
        this.id = ++autoId;
    }

    public String toString1() {
        return "Student " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +"\n"
                ;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
