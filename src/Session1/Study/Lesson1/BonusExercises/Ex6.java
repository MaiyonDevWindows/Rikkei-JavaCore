package Session1.Study.Lesson1.BonusExercises;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        float num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        num1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào số thứ hai: ");
        num2 = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào số thứ ba: ");
        num3 = Float.parseFloat(scanner.nextLine());
        if (num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " là số lớn nhất!!");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " là số lớn nhất!!");
        else
            System.out.println(num3 + " là số lớn nhất!!");
        if (num1 <= num2 && num1 <= num3)
            System.out.println(num1 + " là số nhỏ nhất!!");
        else if (num2 <= num1 && num2 <= num3)
            System.out.println(num2 + " là số nhỏ nhất!!");
        else
            System.out.println(num3 + " là số nhỏ nhất!!");
    }
}
