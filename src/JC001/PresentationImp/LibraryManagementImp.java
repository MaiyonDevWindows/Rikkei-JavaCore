package JC001.PresentationImp;

import JC001.Presentation.IManagementMenu;
import JC001.Utilities.InputHandles;

import java.util.Scanner;

public class LibraryManagementImp implements IManagementMenu {
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
                    CategoryManagementImp categoryManagement = new CategoryManagementImp();
                    categoryManagement.displayMenu(scanner);
                    break;
                case 2:
                    BookManagementImp bookManagement = new BookManagementImp();
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
