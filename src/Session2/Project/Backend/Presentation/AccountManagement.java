package Session2.Project.Backend.Presentation;

import Session2.Project.Backend.Utilities.CommonHandles;

import java.util.Scanner;

public class AccountManagement implements IManagement {
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.print("""
                    |===============ACCOUNT MANAGEMENT===============|
                    1. Display all accounts data.
                    2. Create new accounts.
                    3. Change account status.
                    4. Search for accounts.
                    5. Back.
                    """);
            choice = CommonHandles.inputChoice(scanner);
            switch (choice){
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5:
                    isExit = true;
                    break;
                default:
                    System.err.println("Your choice is not valid value, please try again.");
            }
        }while(!isExit);
    }
}
