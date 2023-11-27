package Lesson2.BonusEx;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double basicSalary, totalSalary;
        int actualWorkday;
        final int workdayInMonth = 26;
        System.out.print("Nhập vào lương cơ bản của nhân viên: ");
        basicSalary = scanner.nextFloat();
        System.out.print("Nhập vào ngày công thực tế của nhân viên: ");
        actualWorkday = scanner.nextInt();
        if (actualWorkday > workdayInMonth) {
            int normalWorkday = workdayInMonth;
            int surplusWorkday = actualWorkday - workdayInMonth;

            double normalSalary = basicSalary * (normalWorkday/ (double) workdayInMonth);
            double surplusSalary = basicSalary * 1.5 * (surplusWorkday/ (double) workdayInMonth);

            totalSalary = normalSalary + surplusSalary;
        } else {
            totalSalary = basicSalary * ((double) actualWorkday / workdayInMonth);
        }
        System.out.printf("Lương nhân viên: %f", (float) totalSalary);
    }
}
