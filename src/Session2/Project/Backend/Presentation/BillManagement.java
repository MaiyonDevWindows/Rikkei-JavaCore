package Session2.Project.Backend.Presentation;

import Session2.Project.Backend.Utilities.CommonHandles;

import java.util.Scanner;

public class BillManagement implements IManagement {
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.print("""
                    |===============BILL MANAGEMENT===============|
                    1. Display all export bills.
                    2. Add new export bills.
                    3. Update export bill data.
                    4. Export bill details.
                    5. Approve export bills.
                    6. Find export bills.
                    7. Back.
                    """);
            choice = CommonHandles.inputChoice(scanner);
            switch (choice){
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
                case 7:
                    isExit = true;
                    break;
                default:
                    System.err.println("Your choice is not valid value, please try again.");
            }
        }while (!isExit);
    }
}
