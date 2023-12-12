package JC001.businessImp;

import JC001.entityImp.Book;
import JC001.utilities.InputDataMethods;

import java.util.Iterator;
import java.util.Scanner;

public class BookBusinessImp {
    public static void addNewBooks(Scanner scanner){
        System.out.print("Please enter n value to add new books: ");
        int n = InputDataMethods.inputInteger(scanner);
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter book %d data\n", i + 1);
            Book book = new Book();
            book.input(scanner);
            Book.booksList.add(book);
        }
    }
    public static void displayAllBooks(){
        Iterator<Book> bookIterator = Book.booksList.iterator();
        while (bookIterator.hasNext()){
            bookIterator.next().output();
        }
    }
}
