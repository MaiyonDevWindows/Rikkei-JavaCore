package Lesson3.BonusExercises;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber, choice = 0;
        System.out.print("Nhập vào số nguyên thứ nhất: ");
        firstNumber = scanner.nextInt();
        System.out.print("Nhập vào số nguyên thứ hai: ");
        secondNumber = scanner.nextInt();
        while (choice != 8) {
            System.out.println("**********************CACULATOR**********************\n" + "1. Tổng 2 số\n" + "2. Hiệu 2 số\n" + "3. Tích 2 số\n" + "4. Thương 2 số\n" + "5. Số dư trong phép chia 2 số\n" + "6. Ước chung lớn nhất\n" + "7. Bội chung nhỏ nhất\n" + "8. Thoát\n" + "Lựa chọn của bạn:\n");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.printf("Tổng của hai số nguyên %d và %d là: %d\n",
                            firstNumber, secondNumber, (firstNumber + secondNumber));
                    break;
                }
                case 2: {
                    System.out.printf("Hiệu của hai số nguyên %d và %d là: %d\n",
                            firstNumber, secondNumber, (firstNumber - secondNumber));
                    break;
                }
                case 3: {
                    System.out.printf("Tích của hai số nguyên %d và %d là: %d\n",
                            firstNumber, secondNumber, (firstNumber * secondNumber));
                    break;
                }
                case 4: {
                    System.out.printf("Thương của hai số nguyên %d và %d là: %f\n",
                            firstNumber, secondNumber, (float) (firstNumber / secondNumber));
                    break;
                }
                case 5: {
                    System.out.printf("Số dư của phép chia hai  %d và %d là: %.2f\n",
                            firstNumber, secondNumber, (float) (firstNumber % secondNumber));
                    break;
                }
                case 6: {
                    int a = firstNumber, b = secondNumber;
                    while (b != 0) {
                        int temp = b;
                        b = a % b;
                        a = temp;
                    }
                    System.out.println("Ước chung lớn nhất của hai số nguyên là: " + a);
                    break;
                }
                case 7: {
                    int max = Math.max(firstNumber, secondNumber);
                    int min = Math.min(firstNumber, secondNumber);
                    for (int i = max; ; i += max) {
                        if (i % min == 0) {
                            System.out.println("Bội chung nhỏ nhất của hai số nguyên là: " + i);
                            break;
                        }
                    }
                    break;
                }
                case 8:
                    System.exit(0); // Thoát chương trình.
                default:
                    System.out.println("Vui lòng nhập vào giá trị từ 1 - 8!");
            }
        }
    }
}
