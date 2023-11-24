package BonusEx;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên có 4 chữ số: ");
        int number = scanner.nextInt();
        if (String.valueOf(number).length() != 4) {
            System.out.println("Vui lòng nhập số có đúng 4 chữ số.");
            return;
        }
        int sum = 0;
        int tempNumber = number;
        while (tempNumber != 0) {
            sum += tempNumber % 10;
            tempNumber /= 10;
        }
        int reverseNumber = 0;
        tempNumber = number;
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            reverseNumber = reverseNumber * 10 + digit;
            tempNumber /= 10;
        }
        System.out.println("Tổng các chữ số: " + sum);
        System.out.println("Số nghịch đảo: " + reverseNumber);
    }
}
