package Lesson2.BonusExercises;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 số nguyên: ");
        int intValue = Integer.parseInt(scanner.nextLine());
        String msg;
        if (intValue % 3 == 0 && intValue % 5 == 0) msg = "Số chia hết được cả cho 3 và 5";
        else if (intValue % 3 == 0) msg = "Số chỉ chia hết cho 3";
        else if (intValue % 5 == 0) msg = "Số chỉ chia hết cho 5";
        else msg = "Số không chia hết cho 3, cũng không chia hết cho 5";
        System.out.println(msg);
    }
}
