package Lesson9.BonusExercises.ra.businessImp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
        System.out.println("Please enter employee name to find: ");
        String findEmployeeId = scanner.nextLine();
        int indexUpdate = Employee.getEmployeeIndexById(findEmployeeId);
        if(indexUpdate >= 0){
            Employee.employees[indexUpdate].updateEmployee(scanner);
        }else System.err.println("Employee id is not exist.");
    }

    public static void updateEmployeeData(Scanner scanner){
        String findEmployeeId;
        System.out.println("Please enter employee id to update data: ");
        findEmployeeId = scanner.nextLine();
        System.out.println("fix");
    }
    public static void deleteEmployee(Scanner scanner){
        String delEmployeeId;
        System.out.println("Please enter employee id to delete data:");
        System.out.println("fix");
    }
    public static void sortEmployeeBySalaryAsc(){
        Employee[] tempEmployees = Arrays.copyOf(Employee.employees, Employee.empArrayIndex);
        Collections.sort(Arrays.asList(tempEmployees));
        Employee.employees = Arrays.copyOf(Employee.employees, Employee.empArrayIndex);
        for (Employee employee: Employee.employees) {
            employee.displayData();
        }
    }
    public static void sortEmployeeByNameDesc(){
        Employee[] tempEmployees = Arrays.copyOf(Employee.employees, Employee.empArrayIndex);
        Collections.sort(Arrays.asList(Employee.employees), new Comparator<Employee>() {
            @Override
            public int compare(Employee employee01, Employee employee02) {
                return - employee01.getEmployeeName().compareTo(employee02.getEmployeeName());
            }
        });
        Employee.employees = Arrays.copyOf(Employee.employees, Employee.empArrayIndex);
        for (Employee employee: Employee.employees) {
            employee.displayData();
        }
    }
    public static void sortEmployeeByYearAsc(){
        Employee[] tempEmployees = Arrays.copyOf(Employee.employees, Employee.empArrayIndex);
        Collections.sort(Arrays.asList(Employee.employees), new Comparator<Employee>() {
            @Override
            public int compare(Employee employee01, Employee employee02) {
                return employee01.getEmployeeYear() - employee02.getEmployeeYear();
            }
        });
        Employee.employees = Arrays.copyOf(Employee.employees, Employee.empArrayIndex);
        for (Employee employee: Employee.employees) {
            employee.displayData();
        }
    }
}
