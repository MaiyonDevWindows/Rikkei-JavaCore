package Lesson1.Classroom;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // Xây dựng ứng dụng xem phim 18+.
        // Cho phép người dùng nhập tên và tuổi, nếu người dùng trên 18 tuổi thì thông báo mời bạn xem phim
        // Còn nếu không thì thông báo bạn chưa đủ tuổi xem phim.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ứng dụng xem phim 18+");
        System.out.print("Nhập vào tên của bạn: ");
        String customerName = scanner.nextLine();
        System.out.print("Nhập vào tuổi của bạn: ");
        int customerAge = Integer.parseInt(scanner.nextLine());
        String systemMsg = (customerAge > 18) ? "Mời bạn xem phim!" : "Bạn chưa đủ tuổi xem phim!";
        System.out.println(systemMsg);
    }
}