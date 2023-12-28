package Session1.Project.JC002.PresentationImp;

import Session1.Project.JC002.Presentation.IManagementMenu;
import Session1.Project.JC002.Utilities.InputHandles;

import java.util.Scanner;

public class CategoryManagementImp implements IManagementMenu {

    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.print("===== CATEGORY MANAGEMENT =====\n" +
                    "1. Add new categories .\n" +
                    "2. Update category by id.\n" +
                    "3. Delete category.\n" +
                    "4. Find categories by category name.\n" +
                    "5. Statistics the number of products by category.\n" +
                    "6. Back.\n" +
                    "Please enter your choice: ");
            choice = InputHandles.inputInteger(scanner);
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
