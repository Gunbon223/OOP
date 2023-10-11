package bvn6_3;

import java.util.Scanner;

public class Main {
    public static Scanner  scan = new Scanner(System.in);
    public static void main(String[] args) {
        Manage yourVehicle = chooseVehicle();
        System.out.println("Tong thoi gian di het: "+yourVehicle.timeToDes(distanceInput())+"h" + "\n"+yourVehicle+"km/h" );
    }

    public static Manage chooseVehicle() {
        System.out.print("Chon phuong tien ban muon di Bus/Train/Plane: ");
        String vehicle = scan.nextLine();
        if (vehicle.equalsIgnoreCase("bus")) {
             Manage vehicle1 = new Bus();
            return vehicle1;
        }
        if (vehicle.equalsIgnoreCase("train")) {
            Manage vehicle1 = new Train();
            return vehicle1;
        }
        if (vehicle.equalsIgnoreCase("plane")) {
            Manage vehicle1 = new Plane();
            return vehicle1;
        }
        else {
            System.out.println("Nhap sai vui long nhap lai");
        }
        Manage vehiclex = new Manage();
        return vehiclex;
    }

    public static double distanceInput() {
        System.out.print("Nhap quang duong ban muon di(km): ");
        return Double.parseDouble(scan.nextLine());
    }

}
