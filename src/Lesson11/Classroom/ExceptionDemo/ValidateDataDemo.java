package Lesson11.Classroom.ExceptionDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ValidateDataDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numnber = validateInt(scanner);
        Date date = validateDate(scanner);
    }

    public static int validateInt(Scanner scanner) {
        int number;
        System.out.print("Nhập vào 1 số nguyên: ");
        do {
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number > 0) return number;
                else System.out.println("Vui lòng nhập vào số nguyên > 0.");
            } catch (NumberFormatException ex) {
                System.err.println("Vui lòng nhập vào số nguyên.");
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        } while (true);
    }

    public static Date validateDate(Scanner scanner) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhập vào một ngày:");
        do {
            try {
                Date date = sdf.parse(scanner.nextLine());
                return date;
            } catch (ParseException e) {
                System.err.println("Định dạng ngày dd/MM/yyyy, vui lòng nhập lại");
            }
        } while (true);
    }
}
