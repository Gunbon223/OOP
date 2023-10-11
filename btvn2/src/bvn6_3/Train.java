package bvn6_3;

public class Train extends Manage{
    private int speed = 40;
    public double timeToDes(double distance) {
        return distance*80;
    }

    @Override
    public String toString() {
        return "Train voi speed" +
                "speed=" + speed ;
    }
}
