package Session1.Study.Lesson1.Exercises;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rectLength, rectWidth;
        System.out.print("Please enter rectangle width: ");
        rectLength = Float.parseFloat(scanner.nextLine());
        System.out.print("Please enter rectangle height: ");
        rectWidth = Float.parseFloat(scanner.nextLine());
        System.out.println("Perimeter of a rectangle: " + 2 * (rectLength + rectWidth));
        System.out.println("Area of a rectangle: " + (rectLength * rectWidth));
    }
}
