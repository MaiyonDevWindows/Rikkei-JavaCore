package Lesson3.BonusExercises;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên thứ nhất: ");
        num1 = scanner.nextInt();
        System.out.print("Nhập vào số nguyên thứ hai: ");
        num2 = scanner.nextInt();
        System.out.println("Nhập vào số nguyên thứ ba: ");
        num3 = scanner.nextInt();
        int choice = 0;
        while (choice != 4) {
            System.out.println("**********************CACULATOR**********************\n" +
                    "1. Tổng 3 số nguyên\n" +
                    "2. Trung bình cộng của 3 số nguyên\n" +
                    "3. Số lớn nhất, nhỏ nhất trong 3 số\n" +
                    "4. Thoát\n" +
                    "Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Tổng 3 số nguyên là: " + (num1 + num2 + num3));
                    break;
                }
                case 2: {
                    System.out.println("Trung bình cộng của 3 số nguyên là: " + (float) (num1 + num2 + num3) / 3);
                    break;
                }
                case 3:
                    int max = num1, min = num1;
                    if (num2 > max) max = num2;
                    if (num3 > max) max = num3;
                    if (num2 < min) min = num2;
                    if (num3 < min) min = num3;
                    System.out.println("Số lớn nhất: " + max);
                    System.out.println("Số nhỏ nhất: " + min);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Vui lòng nhập lại giá trị 1 - 4!");
            }
        }
    }
}
