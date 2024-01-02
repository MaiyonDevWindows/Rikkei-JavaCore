package Session2.Project.Backend.Presentation;

import Session2.Project.Backend.Utilities.CommonHandles;

import java.util.Scanner;

public class AdminPresentation implements IManagement {
    private IManagement productManagement;
    private IManagement employeeManagement;
    private IManagement accountManagement;
    private IManagement receiptManagement;
    private IManagement billManagement;
    private IManagement reportManagement;
    AdminPresentation(){
        productManagement = new ProductPresentation();
        employeeManagement = new EmployeeManagement();
        accountManagement = new AccountManagement();
        receiptManagement = new ReceiptManagement();
        billManagement = new BillManagement();
        reportManagement = new ReportManagement();
    }
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.print("""
                    |===============WAREHOUSE MANAGEMENT===============|
                    1. Product management.
                    2. Employee management.
                    3. Account management.
                    4. Receipt management.
                    5. Bill management.
                    6. Report management.
                    7. Log out.
                    """);
            choice = CommonHandles.inputChoice(scanner);
            switch (choice){
                case 1:
                    productManagement.displayMenu(scanner);
                    break;
                case 2:
                    employeeManagement.displayMenu(scanner);
                    break;
                case 3:
                    accountManagement.displayMenu(scanner);
                    break;
                case 4:
                    receiptManagement.displayMenu(scanner);
                    break;
                case 5:
                    billManagement.displayMenu(scanner);
                    break;
                case 6:
                    reportManagement.displayMenu(scanner);
                    break;
                case 7:
                    isExit = true;
                    break;
                default:
                    System.err.println("Your choice is not valid value, please try again.");
            }
        } while (!isExit);
    }
}
