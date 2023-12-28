package Session1.Project.JC002.PresentationImp;

import Session1.Project.JC002.Utilities.InputHandles;
import Session1.Project.JC002.Presentation.IManagementMenu;

import java.util.Scanner;

public class StoreManagementImp implements IManagementMenu {

    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.print("===== STORE MANAGEMENT =====\n" +
                    "1. Category management.\n" +
                    "2. Product management.\n" +
                    "3. Exit.\n" +
                    "Please enter your choice: ");
            choice = InputHandles.inputInteger(scanner);
            switch (choice){
                case 1:
                    CategoryManagementImp categoryManagement = new CategoryManagementImp();
                    categoryManagement.displayMenu(scanner);
                    break;
                case 2:
                    ProductManagementImp productManagement = new ProductManagementImp();
                    productManagement.displayMenu(scanner);
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
