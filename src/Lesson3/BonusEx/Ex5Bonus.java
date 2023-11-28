package Lesson3.BonusEx;

public class Ex5Bonus {
    public static void main(String[] args) {
        for (int i = 1; i <= 9 ; i++) {
            System.out.println("Bảng cửu chương của " + i + ": ");
            for (int j = 1; j <= 10 ; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
