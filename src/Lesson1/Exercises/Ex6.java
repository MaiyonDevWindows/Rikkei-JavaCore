package Lesson1.Exercises;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integer value: ");
        int intValue = Integer.parseInt(scanner.nextLine());
        String systemMsg = (intValue % 3 == 0 && intValue % 5 == 0) ? "Divisible by 3 and 5!" :
                (intValue % 3 == 0) ? "Only divisible by 3!" :
                        (intValue % 5 == 0) ? "Only divisible by 5!" : "Not divisible by 3, nor divisible by 5!";
        System.out.println(systemMsg);
    }
}
