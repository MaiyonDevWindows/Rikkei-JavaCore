package Lesson3.Exercises;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----- Menu -----");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn (1-4): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:{
                        System.out.print("Nhập số cần kiểm tra: ");
                        int num = scanner.nextInt();
                        if (num % 2 == 0) {
                            System.out.println(num + " là số chẵn.");
                        } else {
                            System.out.println(num + " là số lẻ.");
                        }
                        break;
                    }
                    case 2:{
                        System.out.print("Nhập số cần kiểm tra: ");
                        int num = scanner.nextInt();
                        boolean laSoNguyenTo = true;
                        if (num < 2) {
                            laSoNguyenTo = false;
                        } else {
                            for (int i = 2; i <= Math.sqrt(num); i++) {
                                if (num % i == 0) {
                                    laSoNguyenTo = false;
                                    break;
                                }
                            }
                        }
                        if (laSoNguyenTo) {
                            System.out.println(num + " là số nguyên tố.");
                        } else {
                            System.out.println(num + " không là số nguyên tố.");
                        }
                        break;
                    }
                    case 3:{
                        System.out.print("Nhập số cần kiểm tra: ");
                        int num = scanner.nextInt();
                        if (num % 3 == 0) {
                            System.out.println(num + " chia hết cho 3.");
                        } else {
                            System.out.println(num + " không chia hết cho 3.");
                        }
                        break;
                    }
                    case 4:
                        System.out.println("Chương trình kết thúc.");
                        System.exit(0);
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                }
            } else {
                System.out.println("Vui lòng nhập số nguyên. Thử lại.");
                scanner.next();
            }
        }
    }
}
