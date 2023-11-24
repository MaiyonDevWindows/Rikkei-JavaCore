import java.lang.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        // Khai báo các biến chứa mã sinh viên và tên sinh viên.
        int studentId;
        String studentName;
        // Khởi tạo giá trị các biến với mã sinh viên là 1, tên sinh viên là Nguyễn Văn A.
        studentId = 1;
        studentName = "Nguyễn Hồng Quân";
        // Khai báo và khởi tạo giá trị các biến chứa tuổi sinh viên, giới tính, số điện thoại, điểm.
        int age = 25;
        boolean gender = false;
        String phoneNumber = "0822206919";
        float mark = 10;
        // Khai báo và khởi tạo giá trị nhiều biến có cùng kiểu dữ liệu.
        int number1 = 8, number2 = 9, number = 10;
        // Khai báo hằng số lương cơ bản = 1tr8
        final double BASIC_SARALY = 1800000;
        // Toán tử ++ và --.
        int numberA = 10;
        int numberB = 10;
        int numberC = numberA++;
        int numberD = ++numberB;
        // Type Casting.
        float b = 10;
        int a = (int) 5.8F;
    }
}