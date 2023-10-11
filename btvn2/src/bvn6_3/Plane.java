package bvn6_3;

public class Plane extends Manage{
    private int speed = 80;

    @Override
    public double timeToDes(double distance) {
        return distance/80;
    }

    @Override
    public String toString() {
        return "Plane voi " +
                "speed= " + speed ;
    }
}
