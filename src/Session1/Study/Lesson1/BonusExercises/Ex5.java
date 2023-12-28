package Session1.Study.Lesson1.BonusExercises;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float mathScore, literatureScore, englishScore;
        do{
            System.out.print("Nhập vào điểm toán: ");
            mathScore = Float.parseFloat(scanner.nextLine());
        }while(mathScore < 0 || mathScore > 10);
        do{
            System.out.print("Nhập vào điểm văn: ");
            literatureScore = Float.parseFloat(scanner.nextLine());
        }while(literatureScore < 0 || literatureScore > 10);
        do{
            System.out.print("Nhập vào điểm tiếng anh: ");
            englishScore = Float.parseFloat(scanner.nextLine());
        }while(englishScore < 0 || englishScore > 10);
        float averageScore = (mathScore + literatureScore + englishScore) / 3;
        System.out.printf("Điểm trung bình các môn: %.2f. ", averageScore);
    }
}
