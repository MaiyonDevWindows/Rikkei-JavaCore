package Lesson11.BonusExercises.ExceptionFileEx.business;

import Lesson11.BonusExercises.ExceptionFileEx.business.entity.Book;
import Lesson11.BonusExercises.ExceptionFileEx.business.utils.inputMethods;

import java.util.*;

public class ShopBusiness {
    public static void inputBooksData(Scanner scanner){
        System.out.print("Please enter number of books to input data: ");
        int inputBooks = inputMethods.inputInteger(scanner);
        for (int i = 0; i < inputBooks; i++) {
            Book book = new Book();
            book.inputData(scanner);
            Book.booksList.add(book);
        }
    }
    public static void displayBooksData(){
        System.out.print("Display all books data: ");
        for (Book book: Book.booksList) {
            book.displayData();
        }
    }
    public static void updateBookById(Scanner scanner){
        System.out.print("Please enter book id to update element: ");
        int updateId = inputMethods.inputInteger(scanner);
        Book book = new Book();
        book.updateDataByBookId(scanner, updateId);
    }
    public static void deleteBookById(Scanner scanner){
        System.out.print("Please enter book id to delete element: ");
        int delBookId = inputMethods.inputInteger(scanner);
        Iterator<Book> iterator = Book.booksList.iterator();
                while(iterator.hasNext()){
                    Book book = iterator.next();
                    if (book.getBookId() == delBookId){
                        iterator.remove();
                        System.out.println("Deleted!");
                        break;
                    }
        }
    }
    public static void sortBooksByExportPriceAsc(){
        System.out.print("Sort book by export price asc");
    }
    public static void countBooksByExportPriceRange(Scanner scanner){
        System.out.print("Please enter export price a: ");
        float aExportPrice = inputMethods.inputFloat(scanner);
        System.out.print("Please enter export price b: ");
        float bExportPrice = inputMethods.inputFloat(scanner);
        for (Book book: Book.booksList) {
            if (book.getExportPrice() >= aExportPrice && book.getExportPrice() <= bExportPrice)
                book.displayData();
        }
    }
    public static void findBookByAuthorName(Scanner scanner){
        System.out.print("Please enter book author name to find: ");
        String authorName = scanner.nextLine();
        for (Book book: Book.booksList) {
            if(book.getAuthor().equals(authorName))
                book.displayData();
        }
    }
}