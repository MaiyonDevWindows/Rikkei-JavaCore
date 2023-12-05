package Lesson3.BonusExercises;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intValue;
        do {
            System.out.print("Nhập vào số nguyên (dừng lại nếu là 0): ");
            intValue = scanner.nextInt();
            if(intValue % 3 == 0) System.out.println(intValue + " chia hết cho 3!");
        } while (intValue != 0);
    }
}
