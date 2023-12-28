package Session1.Project.JC002.PresentationImp;

import Session1.Project.JC002.Presentation.IManagementMenu;
import Session1.Project.JC002.Utilities.InputHandles;

import java.util.Scanner;

public class ProductManagementImp implements IManagementMenu {
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.print("===== PRODUCT MANAGEMENT =====\n" +
                    "1. Add new products.\n" +
                    "2. Update product by id.\n" +
                    "3. Delete product.\n" +
                    "4. Display all products by name A - Z.\n" +
                    "5. Display all products by profit DESC.\n" +
                    "6. Search products.\n" +
                    "7. Back.\n" +
                    "Please enter your choice: ");
            choice = InputHandles.inputInteger(scanner);
            switch (choice){
                case 1:
                    CategoryManagementImp categoryManagement = new CategoryManagementImp();
                    categoryManagement.displayMenu(scanner);
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
                    isExit = true;
                    break;
                default:
                    System.err.println("You enter wrong choice value, please try again.");
            }
        }while (!isExit);
    }
}
