package JC001.presentationImp;

import JC001.presentation.SystemPresentation;
import JC001.utilities.InputHandles;

import java.util.Scanner;

public class LibraryManagementImp implements SystemPresentation {
    @Override
    public void displayMenu(Scanner scanner){
        boolean isExit = false;
        int choice;
        do {
            System.out.print("===== LIBRARY MANAGEMENT =====\n" +
                    "1. Category management.\n" +
                    "2. Book management.\n" +
                    "3. Exit.\n" +
                    "Please enter your choice: ");
            choice = InputHandles.inputInteger(scanner);
            switch (choice){
                case 1:
                    CategoryManagementImp categoryManagementImp = new CategoryManagementImp();
                    categoryManagementImp.displayMenu(scanner);
                    break;
                case 2:
                    BookManagement bookManagement = new BookManagement();
                    bookManagement.displayMenu(scanner);
                    break;
                case 3:
                    isExit = true;
                    break;
                default:
                    System.err.println("You enter wrong choice value, please try again.");
            }
        }while (!isExit);
    }
}
