package JC001.PresentationImp;

import JC001.BusinessImp.BookBusiness;
import JC001.BusinessImp.CategoryBusiness;
import JC001.Presentation.IManagementMenu;
import JC001.Utilities.CommonHandles;
import JC001.Utilities.DataFilePaths;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class CategoryManagementImp implements IManagementMenu {
    @Override
    public void displayMenu(Scanner scanner) {
        CategoryBusiness categoryBusiness = new CategoryBusiness();
        BookBusiness bookBusiness = new BookBusiness();
        boolean isExit = false;
        int choice;
        do {
            categoryBusiness.readDataFromFile(DataFilePaths.categoriesDataFile);
            bookBusiness.readDataFromFile(DataFilePaths.booksDataFile);
            AtomicInteger menuIndex = new AtomicInteger(1);
            System.out.println("===== CATEGORY MANAGEMENT =====");
            System.out.println(menuIndex.getAndIncrement() + ". Add new categories.");
            System.out.println(menuIndex.getAndIncrement() + ". Display list categories by name (A – Z).");
            System.out.println(menuIndex.getAndIncrement() + ". Statistics on book 's category and the number of books in each category.");
            System.out.println(menuIndex.getAndIncrement() + ". Update category.");
            System.out.println(menuIndex.getAndIncrement() + ". Delete category.");
            System.out.println(menuIndex.getAndIncrement() + ". Back.");
            choice = CommonHandles.choiceInteger(scanner);
            switch (choice){
                case 1:
                    categoryBusiness.addNewCategories(scanner);
                    categoryBusiness.writeDataToFile(DataFilePaths.categoriesDataFile);
                    break;
                case 2:
                    categoryBusiness.displayAllCategories();
                    break;
                case 3:
                    categoryBusiness.statisticsByEachCategory(bookBusiness);
                    break;
                case 4:
                    categoryBusiness.updateCategoryById(categoryBusiness, scanner);
                    break;
                case 5:
                    categoryBusiness.deleteCategoryById(scanner);
                    categoryBusiness.writeDataToFile(DataFilePaths.categoriesDataFile);
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
