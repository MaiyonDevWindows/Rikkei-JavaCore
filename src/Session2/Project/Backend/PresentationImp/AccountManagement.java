package Session2.Project.Backend.PresentationImp;

import Session2.Project.Backend.Presentation.IManagement;

import java.util.Scanner;

public class AccountManagement implements IManagement {
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.println("******************ACCOUNT MANAGEMENT****************\n" +
                    "1. Display all accounts data.\n" +
                    "2. Create new accounts.\n" +
                    "3. Change account status.\n" +
                    "4. Search for accounts.\n" +
                    "5. Back.");
            choice = Integer.parseInt(scanner.nextLine());
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
