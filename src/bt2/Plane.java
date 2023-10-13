package bt2;

public class Plane extends VehicleManage{
    @Override
    public void calculateSpeed( double distance) {
        System.out.println("Thoi gian cua may bay: "+ distance/Constant.SPEED_TRAIN+"h");

    }
}
