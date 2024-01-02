package Session2.Project.Backend.Presentation;

import Session2.Project.Backend.Utilities.CommonHandles;

import java.util.Scanner;

public class UserPresentation implements IManagement {
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.print("""
                    |===============WAREHOUSE MANAGEMENT===============|
                    1. List receipt by status.
                    2. Add new receipts.
                    3. Update receipt data.
                    4. Search for receipts.
                    5. List export bills by status.
                    6. Add new export bills.
                    7. Update export bill data.
                    8. Search for export bills.
                    9. Log out.
                    """);
            choice = CommonHandles.inputChoice(scanner);
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    isExit = true;
                    break;
                default:
                    System.err.println("Your choice is not valid value, please try again.");
            }
        } while (!isExit);
    }
}