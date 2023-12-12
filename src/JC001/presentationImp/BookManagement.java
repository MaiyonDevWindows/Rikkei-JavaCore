package JC001.presentationImp;

import JC001.businessImp.BookBusinessImp;
import JC001.presentation.SystemPresentation;
import JC001.utilities.InputDataMethods;

import java.util.Scanner;

public class BookManagement implements SystemPresentation {
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.println("===== BOOK MANAGEMENT =====\n" +
                    "1. Add new books.\n" +
                    "2. Update book data.\n" +
                    "3. Delete book by book id.\n" +
                    "4. Find book by book name.\n" +
                    "5. Display by book 's category.\n" +
                    "6. Back." +
                    "Please enter your choice: ");
            choice = InputDataMethods.inputInteger(scanner);
            switch (choice){
                case 1:
                    BookBusinessImp.addNewBooks(scanner);
                    break;
                case 2:
                    BookBusinessImp.displayAllBooks();
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
