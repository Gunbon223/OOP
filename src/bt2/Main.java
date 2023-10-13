package bt2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Nhap quang duong(Km): ");
        double distanceInput = Double.parseDouble(scan.nextLine());
        VehicleManage vehicle1 = new Bus();
        VehicleManage vehicle2 = new Train();
        VehicleManage vehicle3 = new Plane();

        vehicle1.calculateSpeed(distanceInput);
        vehicle2.calculateSpeed(distanceInput);
        vehicle3.calculateSpeed(distanceInput);

    }
}
