package BonusEx;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 số nguyên: ");
        int intValue = Integer.parseInt(scanner.nextLine());
        System.out.print("Bình phương của số đó là: " + (intValue * intValue));
    }
}
