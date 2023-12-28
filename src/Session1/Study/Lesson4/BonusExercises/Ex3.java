package Session1.Study.Lesson4.BonusExercises;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, cols;
        System.out.print("Nhập vào số dòng của mảng: ");
        rows = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào số cột của mảng: ");
        cols = Integer.parseInt(scanner.nextLine());
        int[][] numbers = new int[rows][cols];
        System.out.println("Nhập vào giá trị các phần tử của mảng: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("numbers[%d][%d]: ", i, j);
                numbers[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("In ra các giá trị phần tử của mảng theo ma trận: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(numbers[i][j] + " ");
            System.out.println();
        }
    }
}
