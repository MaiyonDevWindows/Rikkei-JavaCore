package Exercises;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int rate = 23000;
        System.out.println("Ứng dụng chuyển đổi tiền tệ từ USD sang VND");
        System.out.print("Nhập vào số tiền USD cần chuyển đổi sang VND:");
        float usdValue =  Float.parseFloat(scanner.nextLine());
        float vndValue = usdValue * rate;
        System.out.print("Kết quả sau chuyển đổi: " + vndValue + " VND");
    }
}
