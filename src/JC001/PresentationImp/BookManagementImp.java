package JC001.PresentationImp;

import JC001.BusinessImp.BookBusinessImp;
import JC001.Presentation.IManagementMenu;
import JC001.Utilities.InputHandles;

import java.util.Scanner;

public class BookManagementImp implements IManagementMenu {
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.print("===== BOOK MANAGEMENT =====\n" +
                    "1. Add new books.\n" +
                    "2. Update book data.\n" +
                    "3. Delete book by book id.\n" +
                    "4. Find book by book name.\n" +
                    "5. Display by book 's category.\n" +
                    "6. Back.\n" +
                    "Please enter your choice: ");
            choice = InputHandles.inputInteger(scanner);
            switch (choice){
                case 1:
                    BookBusinessImp.addNewBooks(scanner);
                    break;
                case 2:
                    BookBusinessImp.updateBookData(scanner);
                    break;
                case 3:
                    // BookBusinessImp.deleteBookById(scanner);
                    break;
                case 4:
                    // BookBusinessImp.findBookByBookName(scanner);
                    break;
                case 5:
                    // BookBusinessImp.displayBooksByCategory(scanner);
                    break;
                case 6:
                    isExit = true;
                    break;
                case 7:
                    BookBusinessImp.displayAllBooks();
                    break;
                default:
                    System.err.println("You enter wrong choice value, please try again.");
            }
        }while (!isExit);
    }
}
