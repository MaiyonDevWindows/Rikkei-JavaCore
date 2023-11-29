package Lesson4.Classroom;

import java.util.Scanner;

public class TwoDimensionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Khai báo mảng 2 chiều gồm 3 dòng 4 cột gồm các số nguyên.
        int[][] matrixNumbers = new int[3][4];
        // Nhập gi trị các phần từ của mảng 2 chiều.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Numbers[%d][%d]: ", i, j);
                matrixNumbers[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        // In mảng 2 chiều theo ma trận.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrixNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
