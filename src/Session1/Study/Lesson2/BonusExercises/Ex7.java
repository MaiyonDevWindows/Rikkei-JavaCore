package Session1.Study.Lesson2.BonusExercises;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào năm: ");
        int yearValue = scanner.nextInt();
        System.out.print("Nhập vào tháng: ");
        int monthValue = scanner.nextInt();
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
        System.out.printf("Tháng của năm này có %d ngày", dayValue);
    }
}
