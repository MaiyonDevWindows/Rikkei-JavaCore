package BonusEx;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào bán kính hình tròn: ");
        float rValue = Float.parseFloat(scanner.nextLine());
        System.out.printf("Diện tích hình tròn: %.2f", (Math.PI * rValue * rValue));
    }
}
