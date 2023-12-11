package Lesson11.BonusExercises.ExceptionFileEx.presentation;

import Lesson11.BonusExercises.ExceptionFileEx.business.ShopBusiness;
import Lesson11.BonusExercises.ExceptionFileEx.business.utils.inputMethods;

import java.util.Scanner;

public class BookManagement implements IBookManagement {
    @Override
    public void displayMenu(Scanner scanner) {
        int choice;
        boolean isExit = false;
        do {
            System.out.println("*********************************MENU********************************\n" +
                    "1. Input books data.\n" +
                    "2. Display books data.\n" +
                    "3. Update book data by book id.\n" +
                    "4. Delete book by book id.\n" +
                    "5. Sort book by export price increase.\n" +
                    "6. Statistics books by export price range.\n" +
                    "7. Find books by author name.\n" +
                    "8. Exit.\n" +
                    "Please enter your choice: ");
            choice = inputMethods.inputInteger(scanner);
            switch (choice){
                case 1:
                    ShopBusiness.inputBooksData(scanner);
                    break;
                case 2:
                    ShopBusiness.displayBooksData();
                    break;
                case 3:
                    ShopBusiness.updateBookById(scanner);
                    break;
                case 4:
                    ShopBusiness.deleteBookById(scanner);
                    break;
                case 5:
                    ShopBusiness.sortBooksByExportPriceAsc();
                    break;
                case 6:
                    ShopBusiness.countBooksByExportPriceRange(scanner);
                    break;
                case 7:
                    ShopBusiness.findBookByAuthorName(scanner);
                    break;
                case 8:
                    isExit = true;
                    break;
                default:
                    System.err.println("You enter wrong choice value, please try again.");
            }
        }while (isExit);
    }
}
