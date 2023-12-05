package Lesson1.Exercises;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float mathScore, physicsScore, chemistryScore, literatureScore, englishScore;
        do{
            System.out.print("Nhập vào điểm toán: ");
            mathScore = Float.parseFloat(scanner.nextLine());
        }while(mathScore < 0 || mathScore > 10);
        do{
            System.out.print("Nhập vào điểm lý: ");
            physicsScore = Float.parseFloat(scanner.nextLine());
        }while(physicsScore < 0 || physicsScore > 10);
        do{
            System.out.print("Nhập vào điểm hoá: ");
            chemistryScore = Float.parseFloat(scanner.nextLine());
        }while(chemistryScore < 0 || chemistryScore > 10);
        do{
            System.out.print("Nhập vào điểm văn: ");
            literatureScore = Float.parseFloat(scanner.nextLine());
        }while(literatureScore < 0 || literatureScore > 10);
        do{
            System.out.print("Nhập vào điểm tiếng anh: ");
            englishScore = Float.parseFloat(scanner.nextLine());
        }while(englishScore < 0 || englishScore > 10);
        float averageScore = (mathScore + physicsScore + chemistryScore + literatureScore + englishScore) / 5;
        String studentGrade;
        if(averageScore >= 9) studentGrade = "Xếp loại xuất sắc!";
        else if (averageScore >= 8) studentGrade = "Xếp loại giỏi!";
        else if(averageScore >= 6.5) studentGrade = "Xếp loại khá!";
        else if(averageScore >= 5) studentGrade = "Xếp loại trung bình!";
        else studentGrade = "Xếp loại yếu!";
        System.out.printf("Điểm trung bình các môn: %.2f. " + studentGrade, averageScore);
    }
}