package bvn6_3;

public class Bus extends Manage{
    private int speed = 20;
    public double timeToDes(double distance) {
        return distance*80;
    }

    @Override
    public String toString() {
        return "Bus voi" +
                "speed= " + speed
                ;
    }
}
