package Session1.Study.Lesson4.Classroom;

import java.util.Scanner;

public class SingleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        float[] floatNumbers = {3.1f, 5.8f, -9.2f};
        // In ra phần tử có chỉ số 1 trong mảng arrayFloat.
        System.out.println("Giá trị phần tử có chỉ số 1 trong ArrayFloat là: " + floatNumbers[1]);
        // Nhập giá trị các phần tử mảng numbers.
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Nhập vào phần tử numbers[%d]: ", i);
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        // In ra giá trị các phần tử trong mảng numbers.
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}