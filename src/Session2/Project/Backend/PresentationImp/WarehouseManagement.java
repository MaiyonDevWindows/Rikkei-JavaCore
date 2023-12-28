package Session2.Project.Backend.PresentationImp;

import Session2.Project.Backend.Presentation.IManagement;

import java.util.Scanner;

public class WarehouseManagement{
    public void displayAdminMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.println("""
                    ******************WAREHOUSE MANAGEMENT****************
                    1. Product management.
                    2. Employee management.
                    3. Account management.
                    4. Receipt management.
                    5. Bill management.
                    6. Report management.
                    7. Exit.""");
            choice = Integer.parseInt(scanner.nextLine());
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
        }while(!isExit);
    }
    public void displayUserMenu(Scanner scanner){
        boolean isExit = false;
        int choice;
        do {
            System.out.println("""
                    ******************WAREHOUSE MANAGEMENT****************
                    1. List receipt by status.
                    2. Add new receipts.
                    3. Update receipt data.
                    4. Search for receipts.
                    5. List export bills by status.
                    6. Add new export bills.
                    7. Update export bill data.
                    8. Search for export bills.
                    9. Exit""");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
                case 7: break;
                case 8: break;
                case 9:
                    isExit = true;
                    break;
                default:
                    System.err.println("Your choice is not valid value, please try again.");
            }
        }while (!isExit);
    }
}