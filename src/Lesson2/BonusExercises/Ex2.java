package Lesson2.BonusExercises;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float htmlScore, cssScore, javascriptScore;
        do {
            System.out.print("Nhập vào điểm Html: ");
            htmlScore = Float.parseFloat(scanner.nextLine());
        } while (htmlScore < 0 || htmlScore > 10);
        do {
            System.out.print("Nhập vào điểm Css: ");
            cssScore = Float.parseFloat(scanner.nextLine());
        } while (cssScore < 0 || cssScore > 10);
        do {
            System.out.print("Nhập vào điểm Javacript: ");
            javascriptScore = Float.parseFloat(scanner.nextLine());
        } while (javascriptScore < 0 || javascriptScore > 10);
        float averageScore = (htmlScore + cssScore + javascriptScore) / 3;
        String studentGrade;
        if (averageScore >= 9) studentGrade = "Xuất sắc";
        else if (averageScore >= 8) studentGrade = "Giỏi";
        else if (averageScore >= 7) studentGrade = "Khá";
        else if (averageScore >= 5) studentGrade = "Trung bình";
        else studentGrade = "Yếu";
        System.out.println("Học lực của sinh viên là: " + studentGrade);
    }
}
