package bt2;

public class Bus extends VehicleManage{

    @Override
    public void calculateSpeed(double distance) {
        System.out.println("Thoi gian cua xe Bus: "+ distance/Constant.SPEED_BUS+"h");
    }
}
