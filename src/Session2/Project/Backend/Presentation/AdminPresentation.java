package Session2.Project.Backend.Presentation;

import Session2.Project.Backend.Utilities.CommonHandles;

import java.util.Scanner;

public class AdminPresentation implements IManagement {
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
                    IManagement productManagement = new ProductManagement();
                    productManagement.displayMenu(scanner);
                    break;
                case 2:
                    IManagement employeeManagement = new EmployeeManagement();
                    employeeManagement.displayMenu(scanner);
                    break;
                case 3:
                    IManagement accountManagement = new AccountManagement();
                    accountManagement.displayMenu(scanner);
                    break;
                case 4:
                    IManagement receiptManagement = new ReceiptManagement();
                    receiptManagement.displayMenu(scanner);
                    break;
                case 5:
                    IManagement billManagement = new BillManagement();
                    billManagement.displayMenu(scanner);
                    break;
                case 6:
                    IManagement reportManagement = new ReportManagement();
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
