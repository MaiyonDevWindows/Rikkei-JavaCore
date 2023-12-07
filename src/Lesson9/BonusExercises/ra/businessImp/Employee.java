package Lesson9.BonusExercises.ra.businessImp;

import Lesson9.BonusExercises.ra.business.IEmployee;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class Employee implements IEmployee {
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

    public String inputEmployeeIdValue(Scanner scanner) {
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

    public String inputEmployeeNameValue(Scanner scanner) {
        String employeeNameValue;
        System.out.println("Please enter employee name: ");
        employeeNameValue = scanner.nextLine();
        return employeeNameValue;
    }

    public int inputEmployeeYearValue(Scanner scanner) {
        int employeeYearValue;
        System.out.println("Please enter employee year: ");
        employeeYearValue = Integer.parseInt(scanner.nextLine());
        return employeeYearValue;
    }

    public float inputEmployeeRateValue(Scanner scanner) {
        float employeeRateValue;
        System.out.println("Please enter employee rate: ");
        employeeRateValue = Float.parseFloat(scanner.nextLine());
        return employeeRateValue;
    }

    public float inputEmployeeCommissionValue(Scanner scanner) {
        float employeeCommissionValue;
        System.out.println("Please enter employee commission: ");
        employeeCommissionValue = Float.parseFloat(scanner.nextLine());
        return employeeCommissionValue;
    }

    public float inputEmployeeSalaryValue(Scanner scanner) {
        float employeeSalaryValue;
        System.out.println("Please enter employee salary: ");
        employeeSalaryValue = Float.parseFloat(scanner.nextLine());
        return employeeSalaryValue;
    }

    public boolean inputEmployeeStatusValue(Scanner scanner) {
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
        this.employeeId = inputEmployeeIdValue(scanner);
        this.employeeName = inputEmployeeNameValue(scanner);
        this.employeeYear = inputEmployeeYearValue(scanner);
        this.employeeRate = inputEmployeeRateValue(scanner);
        this.employeeCommission = inputEmployeeCommissionValue(scanner);
        this.employeeSalary = inputEmployeeSalaryValue(scanner);
        this.employeeStatus = inputEmployeeStatusValue(scanner);
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
}
