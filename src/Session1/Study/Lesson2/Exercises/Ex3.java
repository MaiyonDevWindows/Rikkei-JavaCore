package Session1.Study.Lesson2.Exercises;

public class Ex3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean laSoNguyenTo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }
            if (laSoNguyenTo) {
                System.out.print(i + " ");
            }
        }
    }
}
