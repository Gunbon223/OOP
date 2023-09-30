import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hang {
    private String tenHang;
    private String dateOfBirth;
    private String timeNhapString;
    private String timeString;
    private LocalDateTime lcdt1;
    private LocalDateTime lcdt2;
    private LocalDateTime lcdt3;
    public Hang(String tenHang, String dateOfBirth, String timeNhapString, String timeString) {
        this.tenHang = tenHang;
        this.dateOfBirth = dateOfBirth;
        this.timeNhapString = timeNhapString;
        this.timeString = timeString;
    }

    public void epkieu()
    {
        try {
            lcdt1 = LocalDateTime.parse(dateOfBirth, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
            lcdt2 = LocalDateTime.parse(timeNhapString, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
            lcdt3 = LocalDateTime.parse(timeString, DateTimeFormatter.ofPattern("HH:mm:ss"));
        } catch (Exception e) {
            System.out.println("Lỗi khi ép kiểu: " + e.getMessage());
        }
    }

    public void In() {
        System.out.println("Tên hàng: " + tenHang);
        System.out.println("Ngày sinh: " + lcdt1);
        System.out.println("Thời gian nhập: " + lcdt2);
        System.out.println("Thời gian nhập: " + lcdt3);
    }

}
