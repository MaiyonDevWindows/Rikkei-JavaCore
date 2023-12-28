package Session1.Study.Lesson2.BonusExercises;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chỉ số cũ (của tháng trước): ");
        int oldNumber = scanner.nextInt();
        System.out.print("Nhập vào chỉ số mới (của tháng này): ");
        int newNumber = scanner.nextInt();
        int electricNumber = newNumber - oldNumber;
        float total = 0;
        if(electricNumber >= 50) {
            total += 50 * 10000;
            if(electricNumber >= 100){
                total += 50 * 15000;
                if(electricNumber >= 150){
                    total += 50 * 20000;
                    if(electricNumber >= 200){
                        total += 50 * 25000;
                        total += (electricNumber - 200) * 30000;
                    }else total += (electricNumber - 150) * 20000;
                }else total += (electricNumber - 100) * 15000;
            }else total += (electricNumber - 50) * 10000;
        }
        else total += electricNumber * 10000;
        System.out.println("Giá điện tính toán được: " + total);
    }
}
