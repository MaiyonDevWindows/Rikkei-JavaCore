package Lesson3.BonusEx;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intValue;
        do{
            System.out.print("Nhập vào số n từ bàn phím số (1 <= n <= 9): ");
            intValue = scanner.nextInt();
        }while(intValue < 1 || intValue > 9);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + intValue + " = " + (i * intValue));
        }
    }
}
