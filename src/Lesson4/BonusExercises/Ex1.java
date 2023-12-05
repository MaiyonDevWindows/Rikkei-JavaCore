package Lesson4.BonusExercises;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Nhập vào giá trị các phần tử của mảng: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Nhập vào giá trị numbers[%d]: ", i);
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("In ra giá trị các phần tử của mảng: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
