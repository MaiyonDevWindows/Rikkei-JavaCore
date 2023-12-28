package Session1.Study.Lesson2.BonusExercises;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào số nguyên b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào phép tính toán học (+, -, *, /, %): ");
        char operator = scanner.nextLine().charAt(0);
        float result = 0f;
        switch (operator){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = (float) a / b;
                break;
            case '%':
                result = a % b;
                break;
        }
        System.out.printf("Kết quả %d %c %d = %.2f\n", a, operator, b, result);
    }
}
