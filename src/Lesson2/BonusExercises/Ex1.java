package Lesson2.BonusExercises;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 số nguyên: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) System.out.println("Đây là số chẵn!");
        else System.out.println("Đây là số lẻ!");
    }
}
