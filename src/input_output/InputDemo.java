package input_output;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        // Nhập vào mã sinh viên.
        // Khởi tạo đối tượng Scanner.
        Scanner scanner = new Scanner(System.in);
        // Thông báo nhập dữ liệu.
        System.out.println("Nhập vào mã sinh viên: ");
        // Sử dụng phương thức của Scanner lấy giá trị nhập gán vào biến.
        int studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Mã sinh viên: " + studentId);

        // Xoá enter trong bộ đệm.
        // Cách 1:
        // scanner.nextLine(); // Thường không sử dụng.
        // Cách 2: Coi như tất cả dữ liệu nhập vào đều là kiểu chuỗi, sau đó convert về kiểu dữ kiệu mong muốn
        // Sau đó mới truyền vào biến để lưu trữ giá trị.

        // Nhập vào tên sinh viên.
        System.out.println("Nhập vào tên sinh viên: ");
        String studentName = scanner.nextLine();
        System.out.println("Tên sinh viên: " + studentName);
        // Nhập vào tuổi sinh viên.
        System.out.println("Nhập vào tuổi sinh viên: ");
        int studentAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Tuổi sinh viên: " + studentAge);
        // Nhập vào địa chỉ sinh viên.
        System.out.println("Nhập vào địa chỉ sinh viên: ");
        String studentAddress = scanner.nextLine();
        System.out.println("Địa chỉ sinh viên: " + studentAddress);
    }
}
