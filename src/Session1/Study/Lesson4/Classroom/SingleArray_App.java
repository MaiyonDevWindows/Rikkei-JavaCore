package Session1.Study.Lesson4.Classroom;

import java.util.Scanner;

public class SingleArray_App {
    public static void main(String[] args) {
        /*
        Nhập số phần tử mảng (n)
        Khai báo mảng số nguyên 1 chiều gồm n phần tử
        In menu và thực hiện các chức năng theo menu:
        **MENU**
        1. Nhập giá trị các phần tử mảng
        2. In giá trị các phần tử mảng
        3. In giá trị các phần tử có giá trị chẵn và tính tổng
        4. In giá trị các phần tử có chỉ số lẻ và tính tổng
        5. In giá trị các phần tử là số nguyên tố
        6. Sắp xếp mảng tăng dần
        7. Nhập 1 số và thống kê số đó xuất hiện bao nhiêu lần trong mảng
        8. Thoát
        */
        Scanner scanner = new Scanner(System.in);
        int n, choice = 0;
        int[] arrayNumbers;
        System.out.print("Nhập vào số phần tử của mảng: ");
        n = Integer.parseInt(scanner.nextLine());
        arrayNumbers = new int[n];
        while (true){
            System.out.print("**MENU**\n" +
                    "1. Nhập giá trị các phần tử mảng\n" +
                    "2. In giá trị các phần tử mảng\n" +
                    "3. In giá trị các phần tử có giá trị chẵn và tính tổng\n" +
                    "4. In giá trị các phần tử có chỉ số lẻ và tính tổng\n" +
                    "5. In giá trị các phần tử là số nguyên tố\n" +
                    "6. Sắp xếp mảng tăng dần\n" +
                    "7. Nhập 1 số và thống kê số đó xuất hiện bao nhiêu lần trong mảng\n" +
                    "8. Thoát\n" +
                    "Nhập vào lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    for (int i = 0; i < arrayNumbers.length; i++) {
                        System.out.printf("Nhập vào giá trị phần tử của arrayNumbers[%d]: ",i);
                        arrayNumbers[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                }
                case 2:{
                    System.out.println("Danh sách các phần tử mảng: ");
                    for (int arrayNumber : arrayNumbers) {
                        System.out.print(arrayNumber + " ");
                    }
                    System.out.println();
                    break;
                }
                case 3:{
                    int sumValue = 0;
                    System.out.println("In ra các phần tử có giá trị chẵn và tính tổng: ");
                    for (int arrayNumber : arrayNumbers) {
                        if (arrayNumber % 2 == 0) {
                            sumValue += arrayNumber;
                            System.out.print(arrayNumber + " ");
                        }
                    }
                    System.out.println("Tổng của các phần tử chẵn trong mảng là: " + sumValue);
                    break;
                }
                case 4: {
                    int sumValue = 0;
                    System.out.println("In ra các phần tử có chỉ số lẻ và tính tổng: ");
                    for (int i = 0; i < arrayNumbers.length; i++) {
                        if (i % 2 != 0){
                            sumValue += arrayNumbers[i];
                            System.out.print(arrayNumbers[i] + " ");
                        }
                    }
                    System.out.println("Tổng của các phần tử có chỉ số lẻ trong mảng là: " + sumValue);
                    break;
                }
                case 5:{
                    System.out.println("In ra các phần tử là số nguyên tố: ");
                    for (int arrayNumber : arrayNumbers) {
                        boolean checkNguyenTo = true;
                        for (int j = 2; j <= Math.sqrt(arrayNumber); j++) {
                            if (arrayNumber % j == 0) {
                                checkNguyenTo = false;
                                break;
                            }
                        }
                        if (checkNguyenTo) System.out.print(arrayNumber + " ");
                    }
                    System.out.println();
                    break;
                }
                case 6:{
                    System.out.println("Sắp xếp các phần tử trong mảng: ");
                    for (int i = arrayNumbers.length - 1; i >= 0; i--) {
                        for (int j = 1; j <= i; j++) {
                            if (arrayNumbers[j - 1] > arrayNumbers[j]){
                                int temp = arrayNumbers[j];
                                arrayNumbers[j] = arrayNumbers[j - 1];
                                arrayNumbers[j - 1] = temp;
                            }
                        }
                    }
                    for (int arrayNumber : arrayNumbers) {
                        System.out.print(arrayNumber + " ");
                    }
                    System.out.println();
                    break;
                }
                case 7:{
                    System.out.println("Nhập vào 1 số và kiểm tra số đó xuất hiện trong mảng bao nhiêu lần: ");
                    int count = 0, tempValue = Integer.parseInt(scanner.nextLine());
                    for (int arrayNumber : arrayNumbers) {
                        if (arrayNumber == tempValue) count++;
                    }
                    System.out.printf("Số nguyên %d xuất hiện trong mảng %d lần.\n", tempValue, count);
                    break;
                }
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập vào lựa chọn 1 - 8!");
            }
        }
    }
}
