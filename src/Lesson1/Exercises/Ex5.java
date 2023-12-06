package Lesson1.Exercises;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float mathScore, physicsScore, chemistryScore, literatureScore, englishScore;
        do{
            System.out.print("Please enter math mark: ");
            mathScore = Float.parseFloat(scanner.nextLine());
        }while(mathScore < 0 || mathScore > 10);
        do{
            System.out.print("Please enter physics mark: ");
            physicsScore = Float.parseFloat(scanner.nextLine());
        }while(physicsScore < 0 || physicsScore > 10);
        do{
            System.out.print("Please enter chemistry mark: ");
            chemistryScore = Float.parseFloat(scanner.nextLine());
        }while(chemistryScore < 0 || chemistryScore > 10);
        do{
            System.out.print("Please enter literature mark: ");
            literatureScore = Float.parseFloat(scanner.nextLine());
        }while(literatureScore < 0 || literatureScore > 10);
        do{
            System.out.print("Please enter English mark: ");
            englishScore = Float.parseFloat(scanner.nextLine());
        }while(englishScore < 0 || englishScore > 10);
        float averageScore = (mathScore + physicsScore + chemistryScore + literatureScore + englishScore) / 5;
        String studentGrade;
        if(averageScore >= 9) studentGrade = "Excellent rating!";
        else if (averageScore >= 8) studentGrade = "Good rating!";
        else if(averageScore >= 6.5) studentGrade = "Graded fairly!";
        else if(averageScore >= 5) studentGrade = "Average rating!";
        else studentGrade = "Week rating!";
        System.out.printf("Average mark: %.2f. " + studentGrade, averageScore);
    }
}