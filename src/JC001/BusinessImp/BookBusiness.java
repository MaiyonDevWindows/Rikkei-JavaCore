package JC001.BusinessImp;

import JC001.EntityImp.Book;
import JC001.EntityImp.Category;
import JC001.Utilities.InputHandles;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BookBusiness extends DataManagerImp<Book>{
    public void addNewBooks(List<Category> categoryList, Scanner scanner){
        System.out.print("Please enter n value to add new books: ");
        int n = InputHandles.inputInteger(scanner);
        if(!categoryList.isEmpty())
            for (int i = 0; i < n; i++) {
                System.out.printf("Please enter book %d data\n", i + 1);
                Book book = new Book(dataList);
                book.input(scanner);
                addData(book);
            }
        else
            System.err.println("There are no category in your program!\n" +
                    "Please add at least one category and try again!");
    }
    public void displayAllBooks(){
        for (Book book : dataList) {
            book.output();
        }
    }
    public boolean isExistBookId(String bookId){
        for (Book book: dataList) {
            if (book.getBookId().equals(bookId))
                return true;
        }
        return false;
    }
    public void findBookByBookName(Scanner scanner){
        System.out.println("Please enter Book title/Author/Publisher to find books: ");
        String searchString = InputHandles.inputString(scanner);
        List<Book> tempList = dataList.stream()
                .filter(book ->
                        book.getBookTitle().contains(searchString) ||
                                book.getAuthor().contains(searchString) ||
                                book.getPublisher().contains(searchString))
                .collect(Collectors.toList());
        Book.printTableHeaderWithBoundaryAndId();
        for(Book book : tempList){
            book.printTableRowWithBoundaryAndId();
        }
        Book.printTableFooterWithBoundary();
    }
//    public void updateBookData(Scanner scanner){
//        System.out.print("Please enter book id to update data: ");
//        String updateBookId = InputHandles.inputString(scanner);
//        int updateBookIndex = 0;
//        Iterator<Book> bookIterator = Book.booksList.iterator();
//        while (bookIterator.hasNext()){
//            updateBookIndex++;
//            if(bookIterator.next().getBookId().equals(updateBookId))
//                break;
//        }
//    }
}
