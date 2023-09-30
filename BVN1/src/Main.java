import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên hàng nhập kho: ");
        String tenHang = scanner.nextLine();
        System.out.println("Mời bạn nhập ngày tháng năm sinh (yyyy/MM/dd): ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Mời bạn nhập thời gian nhập hàng (yyyy/MM/dd HH:mm:ss): ");
        String timeNhapString = scanner.nextLine();
        System.out.println("Mời bạn nhập thời gian (HH:mm:ss): ");
        String timeString = scanner.nextLine();

        LocalDateTime lcdt1 = LocalDateTime.parse(dateOfBirth, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        LocalDateTime lcdt2 = LocalDateTime.parse(timeNhapString, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        LocalDateTime lcdt3 = LocalDateTime.parse(timeString, DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.println("Tên hàng: " + tenHang);
        System.out.println("Ngày sinh: " + lcdt1);
        System.out.println("Thời gian nhập: " + lcdt2);
        System.out.println("Thời gian nhập: " + lcdt3);


//        Hang h =new Hang("hello","2023/09/12","2023/09/12 10:30:00","11:45:00");
//        h.In();


    }


}