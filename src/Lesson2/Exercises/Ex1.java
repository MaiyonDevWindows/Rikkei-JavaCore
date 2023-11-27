package Lesson2.Exercises;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int headValue, tailValue, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào giá trị đầu: ");
        headValue = scanner.nextInt();
        System.out.print("Nhập vào giá trị cuối: ");
        tailValue = scanner.nextInt();
        for (int i = headValue; i <= tailValue; i++){
            sum += i % 2 == 0 ? i : 0;
        }
        System.out.println("Tổng: " + sum);
    }
}