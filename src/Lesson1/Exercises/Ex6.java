package Lesson1.Exercises;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên: ");
        int intValue = Integer.parseInt(scanner.nextLine());
        String systemMsg = (intValue % 3 == 0 && intValue % 5 == 0) ? "Chia hết cho cả 3 và 5!" :
                (intValue % 3 == 0) ? "Chỉ chia hết cho 3!" :
                        (intValue % 5 == 0) ? "Chỉ chia hết cho 5!" : "Không chia hết cho 3, cũng không chia hết cho 5!";
        System.out.println(systemMsg);
    }
}
