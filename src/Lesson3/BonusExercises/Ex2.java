package Lesson3.BonusExercises;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intValue, sumValue = 0;
        do {
            System.out.print("Nhập vào số nguyên từ bàn phím (dừng lại nếu là 0): ");
            intValue = scanner.nextInt();
            sumValue += intValue % 2 != 0 ? intValue : 0;
        } while (intValue != 0);
        System.out.println("Tổng các số lẻ nhập vào: " + sumValue);
    }
}
