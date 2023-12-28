package Session1.Study.Lesson1.BonusExercises;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rectLength, rectWidth;
        System.out.print("Nhập vào chiều dài hcn: ");
        rectLength = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập vào chiều rộng hcn: ");
        rectWidth = Float.parseFloat(scanner.nextLine());
        System.out.print("Diện tích của hcn: " + (rectLength * rectWidth));
    }
}
