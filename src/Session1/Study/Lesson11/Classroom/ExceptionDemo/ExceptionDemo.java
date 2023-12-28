package Session1.Study.Lesson11.Classroom.ExceptionDemo;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số thứ hai: ");
        int number2 = Integer.parseInt(scanner.nextLine());
        int result = 0;
        try {
            result = number1 / number2;
        } catch (ArithmeticException ex) {
            number2 = 1;
            result = number1 / number2;
            ex.printStackTrace();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println("Thương hai số: " + result);
    }
}
