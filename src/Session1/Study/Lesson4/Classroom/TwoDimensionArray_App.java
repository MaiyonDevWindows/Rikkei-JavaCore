package Session1.Study.Lesson4.Classroom;

import java.util.Scanner;

public class TwoDimensionArray_App {
    /*
    1. Nhập vào số dòng và số cột của mảng 2 chiều (row * col)
    2. Khai báo mảng 2 chiều (row*col)
    3. In menu và thực hiện các chức năng theo menu
    **MENU**
    1. Nhập giá trị các phần tử mảng
    2. In giá trị các phần tử mảng theo ma trận
    3. In giá trị các phần tử trên đường biên và tính tổng
    4. In giá trị các phần tử trên đường chéo chính và chéo phụ, tính tổng
    5. Tìm giá trị lớn nhất và nhỏ nhất trong mảng
    6. Sắp xếp mảng giảm dần theo cột
    7. Thống kê các phần tử có giá trị lẻ chia hết cho 3
    8. Thoát
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cols, rows, choice = 0;
        System.out.print("Nhập vào số dòng của mảng 2 chiều: ");
        rows = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào số cột của mảng 2 chiều: ");
        cols = Integer.parseInt(scanner.nextLine());
        int[][] matrixNumbers = new int[rows][cols];
        while (true) {
            System.out.println("**MENU**\n" +
                    "1. Nhập giá trị các phần tử mảng\n" +
                    "2. In giá trị các phần tử mảng theo ma trận\n" +
                    "3. In giá trị các phần tử trên đường biên và tính tổng\n" +
                    "4. In giá trị các phần tử trên đường chéo chính và chéo phụ, tính tổng\n" +
                    "5. Tìm giá trị lớn nhất và nhỏ nhất trong mảng\n" +
                    "6. Sắp xếp mảng giảm dần theo cột\n" +
                    "7. Thống kê các phần tử có giá trị lẻ chia hết cho 3\n" +
                    "8. Thoát\n" +
                    "Nhập vào lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    System.out.println("Nhập vào giá trị các phần tử mảng:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.printf("Nhập vào numbers[%d][%d]: ", i, j);
                            matrixNumbers[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("In giá trị các phần tử mảng theo ma trận: ");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++)
                            System.out.print(matrixNumbers[i][j] + " ");
                        System.out.println();
                    }
                    break;
                }
                case 3: {
                    int sum = 0;
                    System.out.println("In ra giá trị các phần tử đường biên: ");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                                System.out.print(matrixNumbers[i][j] + " ");
                                sum += matrixNumbers[i][j];
                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    System.out.println("Tổng của các giá trị đường biên: " + sum);
                    break;
                }
                case 4: {
                    if (rows != cols) {
                        System.out.println("Ma trận này không có đường chéo chính và phụ!");
                        break;
                    }
                    System.out.println("Các phần tử đường chéo chính: ");
                    int sumMain = 0, sumVice = 0;
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            if (i == j) {
                                System.out.print(matrixNumbers[i][j] + " ");
                                sumMain += matrixNumbers[i][j];
                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    System.out.println("Các phần tử đường chéo phụ: ");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            if (i + j == cols - 1) {
                                System.out.print(matrixNumbers[i][j] + " ");
                                sumVice += matrixNumbers[i][j];
                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    System.out.println("Tổng của các giá trị trên đường chéo chính: " + sumMain);
                    System.out.println("Tổng của các giá trị trên đường chéo phụ: " + sumVice);
                    break;
                }
                case 5: {
                    int max = matrixNumbers[0][0], min = matrixNumbers[0][0];
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            max = Math.max(matrixNumbers[i][j], max);
                            min = Math.min(matrixNumbers[i][j], min);
                        }
                    }
                    System.out.println("Giá trị lớn nhất trong ma trận là: " + max);
                    System.out.println("Giá trị nhỏ nhất trong ma trận là: " + min);
                    break;
                }
                case 6:{
                    System.out.println("Sắp xếp mảng giảm dần theo cột: ");
                    for (int k = 0; k < cols; k++) {
                        for (int i = 0; i < rows - 1; i++) {
                            int maxInd = i;
                            for (int j = i + 1; j < rows; j++)
                                if (matrixNumbers[maxInd][k] < matrixNumbers[j][k])
                                    maxInd = j;
                            int temp = matrixNumbers[i][k];
                            matrixNumbers[i][k] = matrixNumbers[maxInd][k];
                            matrixNumbers[maxInd][k] = temp;
                        }
                    }
                    break;
                }
                case 7:{
                    System.out.println("Thống kê các phần tử có giá trị là lẻ chia hết cho 3:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            if(matrixNumbers[i][j] % 2 != 0 && matrixNumbers[i][j] % 3 == 0)
                                System.out.print(matrixNumbers[i][j] + " ");
                        }
                    }
                    System.out.println();
                    break;
                }
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập vào giá trị từ 1 - 8");
            }
        }
    }
}
