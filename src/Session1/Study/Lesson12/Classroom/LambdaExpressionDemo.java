package Session1.Study.Lesson12.Classroom;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(2);
        listInt.add(5);
        listInt.add(7);
        listInt.add(10);
        listInt.add(14);
        listInt.add(13123);
        System.out.println("Sử dụng vòng lặp: ");
        for (int element : listInt) {
            System.out.println(element);
        }
        // Sử dụng foreach của Collections.
    }
}