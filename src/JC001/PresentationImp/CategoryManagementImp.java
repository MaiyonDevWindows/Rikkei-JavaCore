package JC001.PresentationImp;

import JC001.BusinessImp.CategoryBusinessImp;
import JC001.Presentation.IManagementMenu;
import JC001.Utilities.InputHandles;

import java.util.Scanner;

public class CategoryManagementImp implements IManagementMenu {
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.print("===== CATEGORY MANAGEMENT =====\n" +
                    "1. Add new categories.\n" +
                    "2. Display list categories by name (A – Z).\n" +
                    "3. Statistics on book 's category and the number of books in each category.\n" +
                    "4. Update category.\n" +
                    "5. Delete category.\n" +
                    "6. Back.\n" +
                    "Please enter your choice: ");
            choice = InputHandles.inputInteger(scanner);
            switch (choice){
                case 1:
                    CategoryBusinessImp.addNewCategories(scanner);
                    break;
                case 2:
                    CategoryBusinessImp.displayAllCategories();
                    break;
                case 3:
                    CategoryBusinessImp.statisticsByEachCategory();
                    break;
                case 4:
                    CategoryBusinessImp.updateCategoryById(scanner);
                    break;
                case 5:
                    CategoryBusinessImp.deleteCategoryById(scanner);
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
