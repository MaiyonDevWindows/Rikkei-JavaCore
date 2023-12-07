package Lesson9.BonusExercises.ra.presentation;

import Lesson9.BonusExercises.ra.businessImp.Employee;
import Lesson9.BonusExercises.ra.businessImp.EmployeeBusiness;

import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean isExit = false;
        do {
            System.out.println("********************MENU*********************\n" +
                    "1. Nhập thông tin cho n nhân viên\n" +
                    "2. Hiển thị thông tin nhân viên\n" +
                    "3. Tính lương cho các nhân viên\n" +
                    "4. Tìm kiếm nhân viên theo tên nhân viên\n" +
                    "5. Cập nhật thông tin nhân viên\n" +
                    "6. Xóa nhân viên theo mã nhân viên\n" +
                    "7. Sắp xếp nhân viên theo lương tăng dần (Comparable)\n" +
                    "8. Sắp xếp nhân viên theo tên nhân viên giảm dần (Comparator)\n" +
                    "9. Sắp xếp nhân vên theo năm sinh tăng dần (Comparator)\n" +
                    "10. Exit.\n" +
                    "Please enter your choice value: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    EmployeeBusiness.inputDataEmployees(scanner);
                    break;
                case 2:
                    EmployeeBusiness.displayDataEmployees();
                    break;
                case 3:
                    EmployeeBusiness.calSalaryEmployees();
                    break;
                case 4:
                    EmployeeBusiness.findEmployeesByName(scanner);
                    break;
                case 5:
                    EmployeeBusiness.updateEmployeeData(scanner);
                    break;
                case 6:
                    break;
                case 7:
                    EmployeeBusiness.sortEmployeeBySalaryAsc();
                    break;
                case 8:
                    EmployeeBusiness.sortEmployeeByNameDesc();
                    break;
                case 9:
                    EmployeeBusiness.sortEmployeeByYearAsc();
                    break;
                case 10:
                    isExit = true;
                    break;
                default:
                    System.out.println("Please re enter your correct choice value.");
            }
        }while(!isExit);
    }
}
