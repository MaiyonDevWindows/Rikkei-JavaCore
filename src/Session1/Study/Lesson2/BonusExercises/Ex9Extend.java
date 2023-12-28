package Session1.Study.Lesson2.BonusExercises;

import java.util.Scanner;

public class Ex9Extend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int num3 = scanner.nextInt();
        System.out.print("Nhập số thứ tư: ");
        int num4 = scanner.nextInt();
        int max, midHigh, midLow, min;
        if (num1 >= num2 && num1 >= num3 && num1 >= num4) {
            max = num1;
            if (num2 >= num3 && num2 >= num4) {
                midHigh = num2;
                if (num3 >= num4) {
                    midLow = num3;
                    min = num4;
                } else {
                    midLow = num4;
                    min = num3;
                }
            } else if (num3 >= num2 && num3 >= num4) {
                midHigh = num3;
                if (num2 >= num4) {
                    midLow = num2;
                    min = num4;
                } else {
                    midLow = num4;
                    min = num2;
                }
            } else {
                midHigh = num4;
                if (num2 >= num3) {
                    midLow = num2;
                    min = num3;
                } else {
                    midLow = num3;
                    min = num2;
                }
            }
        } else if (num2 >= num1 && num2 >= num3 && num2 >= num4) {
            max = num2;
            if (num1 >= num3 && num1 >= num4) {
                midHigh = num1;
                if (num3 >= num4) {
                    midLow = num3;
                    min = num4;
                } else {
                    midLow = num4;
                    min = num3;
                }
            } else if (num3 >= num1 && num3 >= num4) {
                midHigh = num3;
                if (num1 >= num4) {
                    midLow = num1;
                    min = num4;
                } else {
                    midLow = num4;
                    min = num1;
                }
            } else {
                midHigh = num4;
                if (num1 >= num3) {
                    midLow = num1;
                    min = num3;
                } else {
                    midLow = num3;
                    min = num1;
                }
            }
        } else if (num3 >= num1 && num3 >= num2 && num3 >= num4) {
            max = num3;
            if (num1 >= num2 && num1 >= num4) {
                midHigh = num1;
                if (num2 >= num4) {
                    midLow = num2;
                    min = num4;
                } else {
                    midLow = num4;
                    min = num2;
                }
            } else if (num2 >= num1 && num2 >= num4) {
                midHigh = num2;
                if (num1 >= num4) {
                    midLow = num1;
                    min = num4;
                } else {
                    midLow = num4;
                    min = num1;
                }
            } else {
                midHigh = num4;
                if (num1 >= num2) {
                    midLow = num1;
                    min = num2;
                } else {
                    midLow = num2;
                    min = num1;
                }
            }
        } else {
            max = num4;
            if (num1 >= num2 && num1 >= num3) {
                midHigh = num1;
                if (num2 >= num3) {
                    midLow = num2;
                    min = num3;
                } else {
                    midLow = num3;
                    min = num2;
                }
            } else if (num2 >= num1 && num2 >= num3) {
                midHigh = num2;
                if (num1 >= num3) {
                    midLow = num1;
                    min = num3;
                } else {
                    midLow = num3;
                    min = num1;
                }
            } else {
                midHigh = num3;
                if (num1 >= num2) {
                    midLow = num1;
                    min = num2;
                } else {
                    midLow = num2;
                    min = num1;
                }
            }
        }
        System.out.println("Các số theo thứ tự giảm dần: " + max + ", " + midHigh + ", " + midLow + ", " + min);
    }
}
