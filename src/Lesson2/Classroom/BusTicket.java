package Lesson2.Classroom;

import java.util.Scanner;

public class BusTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float busTicketPrice = 7000;
        System.out.print("Nhập vào tuổi của bạn: ");
        int age = scanner.nextInt();
        if (age < 6 || age > 60) busTicketPrice = 0;
        else if (age <= 18) busTicketPrice = 3500;
        System.out.println("Giá vé của bạn là " + busTicketPrice);
    }
}
