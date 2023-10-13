package bt2;

public class Train extends VehicleManage{
    @Override
    public void calculateSpeed( double distance) {
        System.out.println("Thoi gian cua tau: "+ distance/Constant.SPEED_PLANE+"h");
    }
}
