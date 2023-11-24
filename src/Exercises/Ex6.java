package Exercises;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên: ");
        int intValue = Integer.parseInt(scanner.nextLine());
        String systemMsg;
        if(intValue % 3 == 0 && intValue % 5 == 0) systemMsg = "Chia hết cho cả 3 và 5!";
        else if(intValue % 3 == 0) systemMsg = "Chỉ chia hết cho 3!";
        else if(intValue % 5 == 0) systemMsg = "Chỉ chia hết cho 5!";
        else systemMsg = "Không chia hết cho 3, cũng không chia hết cho 5!";
        System.out.println(systemMsg);
    }
}
