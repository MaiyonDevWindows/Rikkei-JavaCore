package JC001.presentationImp;

import JC001.presentation.SystemPresentation;
import JC001.utilities.InputDataMethods;

import java.util.Scanner;

public class BookManagement implements SystemPresentation {
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.println("===== BOOK MANAGEMENT =====\n" +
                    "1. Category management.\n" +
                    "2. Book management.\n" +
                    "3. Exit.\n" +
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
