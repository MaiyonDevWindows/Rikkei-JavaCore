package Lesson2.BonusEx;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào ngày: ");
        int dayInput = scanner.nextInt();
        System.out.print("Nhập vào tháng: ");
        int monthValue = scanner.nextInt();
        System.out.print("Nhập vào năm: ");
        int yearValue = scanner.nextInt();
        int dayValue = 30;
        switch (monthValue){
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                dayValue = 31;
                break;
            case 2:{
                if((yearValue % 4 == 0 && yearValue % 100 != 0) || (yearValue % 100 == 0 && yearValue % 400 == 0))
                    dayValue = 29;
                else dayValue = 28;
                break;
            }
        }
        if(yearValue >= 0 && yearValue <= 3000){
            if (monthValue >= 1 && monthValue <= 12){
                if(dayInput >= 1 && dayInput <= dayValue){
                    System.out.println("Ngày tháng năm hợp lệ!");
                    return;
                }
            }
        }
        System.out.println("Ngày tháng năm không hợp lệ!");
    }
}
