import java.util.Scanner;

public class Main {
    public static double doiDoFtoC(double F) {
        return (F-32)/1.8888888;
    }
    public static void main(String[] args) {

        // Cau 1 in ra 1.0 vi 2 so kieu int nen se in ra phan nguyen thoi
        double  d = 9.0 /5;
                System.out.println(d);

        //cau2
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do F de doi: ");
        double a = sc.nextDouble();

        System.out.println(doiDoFtoC(a) +" C");

    }

}