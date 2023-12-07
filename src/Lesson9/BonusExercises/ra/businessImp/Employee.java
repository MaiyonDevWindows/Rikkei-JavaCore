package Lesson9.BonusExercises.ra.businessImp;

import Lesson9.BonusExercises.ra.business.IEmployee;

import java.util.Scanner;

public class Employee implements IEmployee, Comparable<Employee>{
    public static Employee[] employees = new Employee[100];
    public static int empArrayIndex = 0;
    private String employeeId;
    private String employeeName;
    private int employeeYear;
    private float employeeRate;
    private float employeeCommission;
    private float employeeSalary;
    private boolean employeeStatus;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, int employeeYear, float employeeRate,
                    float employeeCommission, float employeeSalary, boolean employeeStatus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeYear = employeeYear;
        this.employeeRate = employeeRate;
        this.employeeCommission = employeeCommission;
        this.employeeSalary = employeeSalary;
        this.employeeStatus = employeeStatus;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public static int getEmployeeIndexById(String employeeId){
        for (int i = 0; i < empArrayIndex; i++) {
            if (employees[i].employeeId.equals(employeeId))
                return i;
        }
        return -1;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeYear() {
        return employeeYear;
    }

    public void setEmployeeYear(int employeeYear) {
        this.employeeYear = employeeYear;
    }

    public float getEmployeeRate() {
        return employeeRate;
    }

    public void setEmployeeRate(float employeeRate) {
        this.employeeRate = employeeRate;
    }

    public float getEmployeeCommission() {
        return employeeCommission;
    }

    public void setEmployeeCommission(float employeeCommission) {
        this.employeeCommission = employeeCommission;
    }

    public float getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public boolean isEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(boolean employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public String inputEmployeeId(Scanner scanner) {
        String employeeIdValue;
        System.out.println("Please enter employee id: ");
        do {
            employeeIdValue = scanner.nextLine();
            if (!isExistEmpId(employeeIdValue))
                return employeeIdValue;
            else
                System.err.println("EmployeeId is exist, please re enter another employeeId value.");
        } while (true);
    }

    public String inputEmployeeName(Scanner scanner) {
        String employeeNameValue;
        System.out.println("Please enter employee name: ");
        employeeNameValue = scanner.nextLine();
        return employeeNameValue;
    }

    public int inputEmployeeYear(Scanner scanner) {
        int employeeYearValue;
        System.out.println("Please enter employee year: ");
        employeeYearValue = Integer.parseInt(scanner.nextLine());
        return employeeYearValue;
    }

    public float inputEmployeeRate(Scanner scanner) {
        float employeeRateValue;
        System.out.println("Please enter employee rate: ");
        employeeRateValue = Float.parseFloat(scanner.nextLine());
        return employeeRateValue;
    }

    public float inputEmployeeCommission(Scanner scanner) {
        float employeeCommissionValue;
        System.out.println("Please enter employee commission: ");
        employeeCommissionValue = Float.parseFloat(scanner.nextLine());
        return employeeCommissionValue;
    }

    public float inputEmployeeSalary(Scanner scanner) {
        float employeeSalaryValue;
        System.out.println("Please enter employee salary: ");
        employeeSalaryValue = Float.parseFloat(scanner.nextLine());
        return employeeSalaryValue;
    }

    public boolean inputEmployeeStatus(Scanner scanner) {
        String employeeStatusStr;
        System.out.println("Please enter employee status: ");
        do {
            employeeStatusStr = scanner.nextLine();
            if (employeeStatusStr.equals("true") || employeeStatusStr.equals("false"))
                return Boolean.parseBoolean(employeeStatusStr);
            else
                System.err.println("Employee status must be true or false, please re enter employee status.");
        } while (true);
    }

    public boolean isExistEmpId(String EmpId) {
        for (int i = 0; i < empArrayIndex; i++) {
            if (employees[i].employeeId.equals(EmpId))
                return true;
        }
        return false;
    }

    @Override
    public void inputData(Scanner scanner) {
        this.employeeId = inputEmployeeId(scanner);
        this.employeeName = inputEmployeeName(scanner);
        this.employeeYear = inputEmployeeYear(scanner);
        this.employeeRate = inputEmployeeRate(scanner);
        this.employeeCommission = inputEmployeeCommission(scanner);
        this.employeeSalary = inputEmployeeSalary(scanner);
        this.employeeStatus = inputEmployeeStatus(scanner);
    }

    @Override
    public void updateEmployee(Scanner scanner) {
        boolean isExit = true;
        do {
            System.out.println("1. Update employee name." +
                    "2. Update employee year." +
                    "3. Update employee rate.\n" +
                    "4. Update employee commission.\n" +
                    "5. Update employee salary.\n" +
                    "6. Update employee status.\n" +
                    "7. Exit.\n" +
                    "Please enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    this.employeeName = inputEmployeeName(scanner);
                    break;
                case 2:
                    this.employeeYear = inputEmployeeYear(scanner);
                    break;
                case 3:
                    this.employeeRate = inputEmployeeRate(scanner);
                    break;
                case 4:
                    this.employeeCommission = inputEmployeeCommission(scanner);
                    break;
                case 5:
                    this.employeeSalary = inputEmployeeSalary(scanner);
                    break;
                case 6:
                    this.employeeStatus = inputEmployeeStatus(scanner);
                    break;
                default:
                    isExit = false;
            }
        } while (isExit);
    }

    @Override
    public void displayData() {
        System.out.printf("Employee id: %s - employee name: %s - employee year: %d\n" +
                "employee rate: %.2f - employee commission: %.2f - employee salary: %.2f - employee status: %s\n",
                employeeId, employeeName, employeeYear, employeeRate, employeeCommission, employeeSalary,
                employeeStatus ? "is working" : "has retired");
    }

    public float calSalary() {
        return employeeSalary = employeeRate * BASIC_SALARY + employeeCommission;
    }

    @Override
    public int compareTo(Employee employee) {
        if(this.employeeSalary - employee.getEmployeeSalary() > 0)
            return 1;
        else if(this.employeeSalary - employee.getEmployeeSalary() == 0)
            return 0;
        else return -1;
    }
}
