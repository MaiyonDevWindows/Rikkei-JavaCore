package Lesson1.BonusEx;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Danh sách sinh viên");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập STT: ");
        int STT = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ và tên: ");
        String stName = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số ĐT: ");
        String phone = scanner.nextLine();
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.println("| ---------------------------------------|");
        System.out.println("| STT | Ho và tên | Tuổi | số ĐT | email |");
        System.out.println("| ---------------------------------------|");
        System.out.println("|" + STT + "|" + stName + "|" + age + "|" + phone + "|" + email + "|");
        System.out.println("| ---------------------------------------|");
    }
}
