package Exercises;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rectLength, rectWidth;
        System.out.print("Nhập vào chiều dài hcn: ");
        rectLength = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập vào chiều rộng hcn: ");
        rectWidth = Float.parseFloat(scanner.nextLine());
        System.out.println("Chu vi của hcn: " + 2 * (rectLength + rectWidth));
        System.out.println("Diện tích của hcn: " + (rectLength * rectWidth));
    }
}
