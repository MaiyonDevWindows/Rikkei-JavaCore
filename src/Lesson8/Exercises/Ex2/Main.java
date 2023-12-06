package Lesson8.Exercises.Ex2;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Area of a circle with radius %.2f is %.2f\n", 3.5f, StaticMethod.calCircleArea(3.5));
        System.out.printf("Area of a circle with radius %.2f is %.2f\n", 6f, StaticMethod.calCircleArea(6));
        System.out.printf("Area of a triangle with edges (%.2f, %.2f, %.2f) is %.2f\n",
                3f, 4f, 5f, StaticMethod.calTriangleArea(3, 4, 5));
        System.out.printf("Area of a triangle with edges (%.2f, %.2f, %.2f) is %.2f\n",
                3f, 4f, 5f, StaticMethod.calTriangleArea(4.5, 7, 6));
        System.out.printf("Area of a rectangle with edges (%.2f, %.2f) is %.2f\n",
                2.5f, 6f, StaticMethod.calRectangleArea(2.5, 6));
        System.out.printf("Area of a rectangle with edges (%.2f, %.2f) is %.2f\n",
                4f, 7f, StaticMethod.calRectangleArea(4, 7));
    }
}
