package Lesson3.Exercises;

public class Ex5 {
    public static void main(String[] args) {
        int n = 1;
        while(true){
            if (n % 5 == 0 && n % 7 == 0 && n % 11 == 0){
                System.out.println("Số chia hết cho 5, 7 và 11 là: " + n);
                break;
            }
            n++;
        }
    }
}
