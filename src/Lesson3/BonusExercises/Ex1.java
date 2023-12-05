package Lesson3.BonusExercises;

public class Ex1 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("In ra các số chẵn trong khoảng từ 1 - 10: ");
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println();
        System.out.println("Tổng của các số đó là: " + sum);
    }
}
