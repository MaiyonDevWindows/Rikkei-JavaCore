package Lesson4.BonusExercises;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên n là số phần tử trong mảng thực: ");
        int n = Integer.parseInt(scanner.nextLine());
        float[] floatNumbers = new float[n];
        float sumFloat = 0;
        for (int i = 0; i < floatNumbers.length; i++) {
            System.out.printf("Nhập vào phần tử floatNumbers[%d]: ", i);
            floatNumbers[i] = Float.parseFloat(scanner.nextLine());
            sumFloat += floatNumbers[i];
        }
        System.out.println("Trung bình cộng của các phần tử trong mảng: " + sumFloat/floatNumbers.length);
    }
}
