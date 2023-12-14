package JC001.BusinessImp;

import JC001.EntityImp.Book;
import JC001.EntityImp.Category;
import JC001.Utilities.InputHandles;

import java.util.Iterator;
import java.util.Scanner;

public class BookBusinessImp {
    public static void addNewBooks(Scanner scanner){
        System.out.print("Please enter n value to add new books: ");
        int n = InputHandles.inputInteger(scanner);
        if(!Category.categoriesList.isEmpty())
            for (int i = 0; i < n; i++) {
                System.out.printf("Please enter book %d data\n", i + 1);
                Book book = new Book();
                book.input(scanner);
                Book.booksList.add(book);
            }
        else
            System.err.println("There are no category in your program!\n" +
                    "Please add at least one category and try again!");
    }
    public static void displayAllBooks(){
        Iterator<Book> bookIterator = Book.booksList.iterator();
        while (bookIterator.hasNext()){
            bookIterator.next().output();
        }
    }
    public static void updateBookData(Scanner scanner){
        System.out.print("Please enter book id to update data: ");
        String updateBookId = InputHandles.inputString(scanner);
        int updateBookIndex = 0;
        Iterator<Book> bookIterator = Book.booksList.iterator();
        while (bookIterator.hasNext()){
            updateBookIndex++;
            if(bookIterator.next().getBookId().equals(updateBookId))
                break;
        }
    }
}
