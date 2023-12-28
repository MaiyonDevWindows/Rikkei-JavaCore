package Session1.Study.Lesson3.BonusExercises;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, choice = 0;
        System.out.print("Nhập vào số nguyên n:");
        n = scanner.nextInt();
        while (choice != 6) {
            System.out.println("**********************PRACTICE**********************\n" +
                    "1. In dãy số chia hết cho 2 và giảm dần (n >= số >= 2)\n" +
                    "2. In các số nhỏ hơn n và tính tổng\n" +
                    "3. In ra các ước số chẵn của n\n" +
                    "4. In ra các ước số lẻ và số lượng các ước lẻ của n\n" +
                    "5. In ra ước số lẻ lớn nhất của n\n" +
                    "6. Thoát\n" +
                    "Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    for (int i = n; i >= 2; i--) {
                        if (i % 2 == 0) System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                }
                case 2: {
                    int sum = 0;
                    for (int i = 1; i < n; i++) {
                        System.out.print(i + " ");
                        sum += i;
                    }
                    System.out.println();
                    System.out.println("Tổng của dãy số là: " + sum);
                    break;
                }
                case 3:{
                    for (int i = 1; i <= n ; i++) {
                        if(n % i == 0 && i % 2 == 0) System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                }
                case 4:{
                    int count = 0;
                    for (int i = 1; i <= n ; i++) {
                        if(n % i == 0 && i % 2 != 0){
                            count++;
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    System.out.println("Số lượng các ước lẻ của n là: " + count);
                    break;
                }
                case 5:{
                    for (int i = n; i >= 1 ; i--) {
                        if(n % i == 0 && i % 2 != 0){
                            System.out.println("Ước số lẻ lớn nhất của n là: " + i);
                            break;
                        }
                    }
                    break;
                }
                case 6:
                    break;
                default:
                    System.out.println("Vui lòng chọn lại giá trị 1 - 6");
            }
        }
    }
}
