package Lesson2.Classroom;

import java.util.Scanner;

public class ktChiaDu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        // Ứng dụng if, else-if, else in ra số dư trong phép chia 5.
        if (number % 5 == 0)
            System.out.println("Số chia hết cho 5!");
        else if (number % 5 == 1) System.out.println("Số chia cho 5 dư 1");
        else if (number % 5 == 2) System.out.println("Số chia cho 5 dư 2");
        else if (number % 5 == 3) System.out.println("Só chia cho 5 dữ 3");
        else System.out.println("Số chia cho 5 dư 4!");
    }
}
