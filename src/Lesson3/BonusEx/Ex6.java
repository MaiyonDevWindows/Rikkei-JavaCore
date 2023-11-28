package Lesson3.BonusEx;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, choice = 0;
        System.out.print("Nhập vào số nguyên thứ nhất: ");
        num1 = scanner.nextInt();
        System.out.print("Nhập vào số nguyên thứ hai: ");
        num2 = scanner.nextInt();
        while (choice != 8) {
            System.out.println("**********************CACULATOR**********************\n" +
                    "1. Tổng 2 số\n" +
                    "2. Hiệu 2 số\n" +
                    "3. Tích 2 số\n" +
                    "4. Thương 2 số\n" +
                    "5. Số dư trong phép chia 2 số\n" +
                    "6. Ước chung lớn nhất\n" +
                    "7. Bội chung nhỏ nhất\n" +
                    "8. Thoát\n" +
                    "Lựa chọn của bạn:\n");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Tổng của hai số nguyên là: " + (num1 + num2));
                    break;
                }
                case 2: {
                    System.out.println("Hiệu của hai số nguyên là: " + (num1 - num2));
                    break;
                }
                case 3: {
                    System.out.println("Tích của hai số nguyên là: " + (num1 * num2));
                    break;
                }
                case 4: {
                    System.out.println("Thương của hai số nguyên là: " + (num1 / num2));
                    break;
                }
                case 5: {
                    System.out.println("Số dư của phép chia hai số là: " + (num1 % num2));
                    break;
                }
                case 6: {
                    int a = num1, b = num2;
                    while (b != 0) {
                        int temp = b;
                        b = a % b;
                        a = temp;
                    }
                    System.out.println("Ước chung lớn nhất của hai số nguyên là: " + a);
                    break;
                }
                case 7:{
                    int max = Math.max(num1, num2);
                    int min = Math.min(num1, num2);
                    for (int i = max;; i+= max) {
                        if(i % min == 0){
                            System.out.println("Bội chung nhỏ nhất của hai số nguyên là: " + i);
                            break;
                        }
                    }
                    break;
                }
                case 8:
                    break;
                default:
                    System.out.println("Vui lòng nhập vào giá trị từ 1 - 8!");
            }
        }
    }
}
