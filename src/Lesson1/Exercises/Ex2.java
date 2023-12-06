package Lesson1.Exercises;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int rate = 23000;
        System.out.println("Currency conversion application");
        System.out.print("Please enter USD value convert to VND value:");
        float usdValue =  Float.parseFloat(scanner.nextLine());
        float vndValue = usdValue * rate;
        System.out.print("Result: " + vndValue + " VND");
    }
}
