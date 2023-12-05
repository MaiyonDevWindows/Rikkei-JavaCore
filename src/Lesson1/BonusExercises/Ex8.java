package Lesson1.BonusExercises;

import java.time.Year;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm sinh của bạn: ");
        int namSinh = Integer.parseInt(scanner.nextLine());
        int namHienTai = Year.now().getValue();
        int tuoi = namHienTai - namSinh;
        String kieuTuoi = (tuoi % 2 == 0) ? "chẵn" : "lẻ";
        System.out.println("Tuổi của bạn là: " + tuoi + " và là tuổi " + kieuTuoi + ".");
    }
}
