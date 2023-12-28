package Session1.Study.Lesson2.BonusExercises;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Nhập vào số thứ 1: ");
        num1 = scanner.nextInt();
        System.out.print("Nhập vào số thứ 2: ");
        num2 = scanner.nextInt();
        System.out.print("Nhập vào số thứ 3: ");
        num3 = scanner.nextInt();
        int max, min, mid;
        if(num1 >= num2 && num1 >= num3){
            max = num1;
            if(num2 >= num3){
                mid = num2;
                min = num3;
            }else{
                mid = num3;
                min = num2;
            }
        }else if(num2 >= num1 && num2 >= num3){
            max = num2;
            if(num1 >= num3){
                mid = num1;
                min = num3;
            }else{
                mid = num3;
                min = num1;
            }
        }else{
            max = num3;
            if(num1 >= num2){
                mid = num1;
                min = num2;
            }else{
                mid = num2;
                min = num1;
            }
        }
        System.out.printf("Các số theo thứ tự giảm dần: %d %d %d", max, mid, min);
    }
}
