package Lesson9.BonusExercises.ra.businessImp;

import java.util.Scanner;

public class EmployeeBusiness {
    public static void inputDataEmployees(Scanner scanner){
        int n;
        System.out.println("Please enter n value: ");
        n = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee();
        for (int i = 0; i < n; i++) {
            System.out.println("Please input data for employee " + i);
            employee.inputData(scanner);
            Employee.employees[Employee.empArrayIndex] = employee;
            Employee.empArrayIndex += 1;
        }
    }
    public static void displayDataEmployees(){
        System.out.println("Display all employees:");
        for (int i = 0; i < Employee.empArrayIndex; i++) {
            Employee.employees[i].displayData();
        }
    }
    public static void calSalaryEmployees(){
        System.out.println("Calculate all employees salary: ");
        for (int i = 0; i < Employee.empArrayIndex; i++) {
            Employee.employees[i].calSalary();
        }
    }
    public static void findEmployeesByName(Scanner scanner){
        String findEmployeeName;
        System.out.println("Please enter employee name to find: ");
        findEmployeeName = scanner.nextLine();
        for (int i = 0; i < Employee.empArrayIndex; i++) {
            if(Employee.employees[i].getEmployeeName().equals(findEmployeeName))
                Employee.employees[i].displayData();
        }
    }
    public static void updatêmployeeData(Scanner scanner){
        String findEmployeeId;
        System.out.println("Please enter employee id to update data: ");
        findEmployeeId = scanner.nextLine();
        Employee tempEmployee = new Employee();
        tempEmployee.inputData(scanner);
    }
}
