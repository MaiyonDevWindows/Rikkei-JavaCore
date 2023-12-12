package JC001.presentationImp;

import JC001.presentation.SystemPresentation;
import JC001.utilities.InputDataMethods;

import java.util.Scanner;

public class CategoryManagement implements SystemPresentation {
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.println("===== CATEGORY MANAGEMENT =====\n" +
                    "1. Add a new category.\n" +
                    "2. Display list categories by name (A – Z).\n" +
                    "3. Statistics on book genres and the number of books in each genre.\n" +
                    "4. Update category.\n" +
                    "5. Delete category.\n" +
                    "6. Back.\n" +
                    "Please enter your choice: ");
            choice = InputDataMethods.inputInteger(scanner);
            switch (choice){
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
                    isExit = true;
                    break;
                default:
                    System.err.println("You enter wrong choice value, please try again.");
            }
        }while (!isExit);
    }
}
