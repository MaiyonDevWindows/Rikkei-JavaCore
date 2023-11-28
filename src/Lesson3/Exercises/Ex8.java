package Lesson3.Exercises;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double canhA, canhB, canhC;
        while (true) {
            System.out.print("Nhập độ dài cạnh A: ");
            canhA = scanner.nextDouble();
            System.out.print("Nhập độ dài cạnh B: ");
            canhB = scanner.nextDouble();
            System.out.print("Nhập độ dài cạnh C: ");
            canhC = scanner.nextDouble();
            if (canhA > 0 && canhB > 0 && canhC > 0 && (canhA + canhB > canhC) &&
                    (canhB + canhC > canhA) && (canhA + canhC > canhB)) {
                double chuVi = canhA + canhB + canhC;
                double p = chuVi / 2;
                double dienTich = Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
                System.out.println("Tam giác có chu vi là " + chuVi + " và diện tích là " + dienTich);
                break;
            } else {
                System.out.println("Lỗi! Ba cạnh không tạo thành một tam giác. Vui lòng nhập lại.");
            }
        }
    }
}
