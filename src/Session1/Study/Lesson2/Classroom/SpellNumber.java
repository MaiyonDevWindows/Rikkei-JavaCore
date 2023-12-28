package Session1.Study.Lesson2.Classroom;

import java.util.Scanner;

public class SpellNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số cần phiên âm (0 - 9): ");
        int number = scanner.nextInt();
        String systemMsg;
        switch (number){
            case 0:
                systemMsg = "Không";
                break;
            case 1:
                systemMsg = "Một";
                break;
            case 2:
                systemMsg = "Hai";
                break;
            case 3:
                systemMsg = "Ba";
                break;
            case 4:
                systemMsg = "Bốn";
                break;
            case 5:
                systemMsg = "Năm";
                break;
            case 6:
                systemMsg = "Sáu";
                break;
            case 7:
                systemMsg = "Bảy";
                break;
            case 8:
                systemMsg = "Tám";
                break;
            case 9:
                systemMsg = "Chín";
                break;
            default:
                systemMsg = "Số nằm ngoài 0 - 9";
        }
        System.out.println(systemMsg);
    }
}
