package JC001.PresentationImp;

import JC001.BusinessImp.BookBusiness;
import JC001.BusinessImp.CategoryBusiness;
import JC001.Presentation.IManagementMenu;
import JC001.Utilities.CommonHandles;
import JC001.Utilities.DataFilePaths;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class BookManagementImp implements IManagementMenu {
    @Override
    public void displayMenu(Scanner scanner) {
        CategoryBusiness categoryBusiness = new CategoryBusiness();
        BookBusiness bookBusiness = new BookBusiness();

        boolean isExit = false;
        int choice;
        do {
            bookBusiness.readDataFromFile(DataFilePaths.booksDataFile);
            categoryBusiness.readDataFromFile(DataFilePaths.categoriesDataFile);

            AtomicInteger menuIndex = new AtomicInteger(1);
            System.out.println("===== BOOK MANAGEMENT =====");
            System.out.println(menuIndex.getAndIncrement() + ". Add new books.");
            System.out.println(menuIndex.getAndIncrement() + ". Update book data.");
            System.out.println(menuIndex.getAndIncrement() + ". Delete book by book id.");
            System.out.println(menuIndex.getAndIncrement() + ". Find book by book name.");
            System.out.println(menuIndex.getAndIncrement() + ". Display by book 's category.");
            System.out.println(menuIndex.getAndIncrement() + ". Back.");
            choice = CommonHandles.choiceInteger(scanner);
            switch (choice){
                case 1:
                    bookBusiness.addNewBooks(categoryBusiness.getDataList() ,scanner);
                    bookBusiness.writeDataToFile(DataFilePaths.booksDataFile);
                    break;
                case 2:
                    // BookBusiness.updateBookData(scanner);
                    break;
                case 3:
                    // BookBusiness.deleteBookById(scanner);
                    break;
                case 4:
                    bookBusiness.findBookByBookName(scanner);
                    break;
                case 5:
                    // BookBusiness.displayBooksByCategory(scanner);
                    break;
                case 6:
                    isExit = true;
                    break;
                case 7:
                    bookBusiness.displayAllBooks();
                    break;
                default:
                    System.err.println("You enter wrong choice value, please try again.");
            }
        }while (!isExit);
    }
}
