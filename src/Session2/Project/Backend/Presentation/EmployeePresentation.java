package Session2.Project.Backend.Presentation;

import Session2.Project.Backend.Business.EmployeeBusiness;
import Session2.Project.Backend.Entity.Employee;
import Session2.Project.Backend.Utilities.CommonHandles;
import Session2.Project.Backend.Utilities.InputHandles;
import Session2.Project.Backend.Utilities.OutputHandles;

import java.util.List;
import java.util.Scanner;

public class EmployeePresentation implements IManagement {
    private EmployeeBusiness employeeBusiness;
    EmployeePresentation(){
        employeeBusiness = new EmployeeBusiness();
    }
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.print("""
                    |===============EMPLOYEE MANAGEMENT===============|
                    1. Display all employees data.
                    2. Add new employees.
                    3. Update employee data.
                    4. Change employee status.
                    5. Search for employees.
                    6. Back.
                    """);
            choice = CommonHandles.inputChoice(scanner);
            switch (choice){
                case 1:
                    displayEmployees(scanner);
                    break;
                case 2:
                    addNewEmployee(scanner);
                    break;
                case 3:
                    updateEmployee(scanner);
                    break;
                case 4:
                    updateEmployeeStatus(scanner);
                    break;
                case 5:
                    searchEmployeeByName(scanner);
                    break;
                case 6:
                    isExit = true;
                    break;
                default:
                    System.err.println("Your choice is not valid value, please try again.");
            }
        }while (!isExit);
    }
    public void displayEmployees(Scanner scanner) {
        int pageNumber = 1;
        List<Employee> employeeList = employeeBusiness.getAll(pageNumber);
        if(!employeeList.isEmpty()){
            boolean isExit = false;
            do {
                if (pageNumber <= 0) {
                    System.out.println(OutputHandles.stringWarning("Can't move previous page anymore."));
                    pageNumber = 1;
                } else if(employeeList.isEmpty()){
                    System.out.println(OutputHandles.stringWarning("Can't move previous page anymore."));
                    pageNumber--;
                } else employeeList.forEach(System.out::println);
                System.out.print("""
                   1. Previous employee page.
                   2. Next employee page.
                   3. Exit employee list view.
                    """);
                int choice = CommonHandles.inputChoice(scanner);
                switch (choice){
                    case 1:
                        pageNumber--;
                        break;
                    case 2:
                        pageNumber++;
                        break;
                    case 3:
                        isExit = true;
                        break;
                    default:
                        System.err.println("Your choice is not valid value, please try again.");
                }
                employeeList = employeeBusiness.getAll(pageNumber);
            } while (!isExit);
        }else System.err.println("There is no data to display");
    }

    public void addNewEmployee(Scanner scanner) {
        Employee employee = new Employee();
        employee.inputData(scanner);
        boolean resultCreate = employeeBusiness.create(employee);
        if (resultCreate) {
            System.out.println(OutputHandles.stringSuccess("Create product successfully."));
        } else {
            System.err.println(OutputHandles.stringError("Create product failure."));
        }
    }
    public void updateEmployee(Scanner scanner) {
        System.out.print("Please enter employee id to update data: ");
        String updateId = InputHandles.inputNormalizeString(scanner);
        if (updateId.length() != 5) {
            System.err.println("Employee id length must be 5 characters.");
        }else{
            Employee employee = employeeBusiness.findById(updateId);
            if (employee != null) {
                employee.updateData(scanner);
                boolean result = employeeBusiness.update(employee);
                if (result) {
                    System.out.println(OutputHandles.stringSuccess("Update employee successfully."));
                } else {
                    System.err.println(OutputHandles.stringError("Update employee failure."));
                }
            } else {
                System.err.println("employee is not exists.");
            }
        }
    }
    public void updateEmployeeStatus(Scanner scanner) {
        System.out.print("Please enter employee id to update status: ");
        String updateId = InputHandles.inputNormalizeString(scanner);
        if (updateId.length() != 5) {
            System.err.println("Employee id length must be 5 characters.");
        }else{
            Employee employee = employeeBusiness.findById(updateId);
            if (employee != null) {
                employee.updateStatus(scanner);
                boolean result = employeeBusiness.update(employee);
                if (result) {
                    System.out.println(OutputHandles.stringSuccess("Update employee successfully."));
                } else {
                    System.err.println(OutputHandles.stringError("Update employee failure."));
                }
            } else {
                System.err.println("Product is not exists.");
            }
        }
    }
    public void searchEmployeeByName(Scanner scanner) {
        System.out.println("Please enter product name to search for: ");
        String findName = InputHandles.inputNormalizeString(scanner);
        int pageNumber = 1;
        List<Employee> employeeList = employeeBusiness.search(findName, pageNumber);
        if(!employeeList.isEmpty()){
            boolean isExit = false;
            do {
                if (pageNumber <= 0) {
                    System.out.println(OutputHandles.stringWarning("Can't move previous page anymore."));
                    pageNumber = 1;
                } else if(employeeList.isEmpty()){
                    System.out.println(OutputHandles.stringWarning("Can't move previous page anymore."));
                    pageNumber--;
                } else employeeList.forEach(System.out::println);
                System.out.print("""
                   1. Previous employee page.
                   2. Next employee page.
                   3. Exit employee list view.
                    """);
                int choice = CommonHandles.inputChoice(scanner);
                switch (choice){
                    case 1:
                        pageNumber--;
                        break;
                    case 2:
                        pageNumber++;
                        break;
                    case 3:
                        isExit = true;
                        break;
                    default:
                        System.err.println("Your choice is not valid value, please try again.");
                }
                employeeList = employeeBusiness.getAll(pageNumber);
            } while (!isExit);
        }else System.err.println("There is no data to display");
    }
}
