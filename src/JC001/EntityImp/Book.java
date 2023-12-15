package JC001.EntityImp;

import JC001.BusinessImp.BookBusiness;
import JC001.BusinessImp.CategoryBusiness;
import JC001.Entity.IEntity;
import JC001.Utilities.InputHandles;

import java.io.Serializable;
import java.time.Year;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

public class Book implements IEntity, Serializable {
    private List<Book> bookList;
    private String bookId;
    private String bookTitle;
    private String author;
    private String publisher;
    private int year;
    private String description;
    private int categoryId;

    public Book() {
    }
    public Book(List<Book> bookList){
        this.bookList = bookList;
    }

    public Book(String bookId, String bookTitle, String author, String publisher, int year, String description, int categoryId) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.description = description;
        this.categoryId = categoryId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescriptions(String description) {
        this.description = description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public void input(Scanner scanner) {
        this.bookId = inputBookId(scanner);
        this.bookTitle = inputBookTitle(scanner);
        this.author = inputAuthor(scanner);
        this.publisher = inputPublisher(scanner);
        this.year = inputYear(scanner);
        this.description = inputDescription(scanner);
        this.categoryId = inputCategoryId(scanner);
    }

    public String inputBookId(Scanner scanner) {
        System.out.print("Please enter book id: ");
        String bookId = InputHandles.inputString(scanner);
        while (!isValidateBookId(bookId) || isExistBookId(bookId))
            bookId = InputHandles.inputString(scanner);
        return bookId;
    }

    public boolean isValidateBookId(String bookId) {
        if (!Pattern.matches("^B.{3}$", bookId)) {
            System.err.println("Your book id is not valid pattern (start with 'B', 4 characters)!");
            return false;
        }
        return true;
    }

    public boolean isExistBookId(String bookId) {
        for (Book book : bookList)
            if (book.bookId.equals(bookId)) {
                System.err.println("Your book id is exist, please enter another book id value!");
                return true;
            }
        return false;
    }

    public String inputBookTitle(Scanner scanner) {
        System.out.print("Please enter book title: ");
        String bookTitle = InputHandles.inputString(scanner);
        while (!isValidateBookTitle(bookTitle) || isExistBookTitle(bookTitle))
            bookTitle = InputHandles.inputString(scanner);
        return capitalieString(bookTitle);
    }

    public String capitalieString(String inputString) {
        return inputString.substring(0, 1).toUpperCase() + inputString.substring(1).toLowerCase();
    }

    public boolean isValidateBookTitle(String bookTitle) {
        if (bookTitle.length() < 6 || bookTitle.length() > 50) {
            System.err.println("Your book title must be in range 6 and 50 characters!");
            System.err.println("Please enter valid book title value!");
            return false;
        }
        return true;
    }

    public boolean isExistBookTitle(String bookTitle) {
        for (Book book : bookList)
            if (book.bookTitle.equals(bookTitle)) {
                System.err.println("Your book title is exist, please enter another book title value!");
                return true;
            }
        return false;
    }

    public String inputAuthor(Scanner scanner) {
        System.out.print("Please enter author name: ");
        return InputHandles.inputString(scanner);
    }

    public String inputPublisher(Scanner scanner) {
        System.out.print("Please enter publisher company name: ");
        return InputHandles.inputString(scanner);
    }

    public int inputYear(Scanner scanner) {
        System.out.print("Please enter publish year: ");
        int publishYear = InputHandles.inputInteger(scanner);
        while (!isValidatePublishYear(publishYear))
            publishYear = InputHandles.inputInteger(scanner);
        return publishYear;
    }

    public boolean isValidatePublishYear(int publishYear) {
        if (publishYear < 1970 || publishYear > Year.now().getValue()) {
            System.err.println("Published year must be greater than 1970 and smaller than current year!");
            return false;
        }
        return true;
    }

    public String inputDescription(Scanner scanner) {
        System.out.print("Please enter book 's description: ");
        return InputHandles.inputString(scanner);
    }

    public int inputCategoryId(Scanner scanner) {
        CategoryBusiness categoryBusiness = new CategoryBusiness();
        categoryBusiness.readDataFromFile("categories.txt");
        categoryBusiness.displayAllCategories();
        System.out.print("Please enter book 's category id: ");
        int categoryId = InputHandles.inputInteger(scanner);
        // Kiểm tra xem trong CategoryList có trường nào không.
        while(!categoryBusiness.isExistCategoryId(categoryId)){
            // Nếu không có thì serr ra lỗi và quay lại.
            System.err.println("Your category id is not exist, please try again.");
            categoryId = InputHandles.inputInteger(scanner);
        }
        return categoryId;
    }
    public int getNumberOfBooksByCategoryId(int categoryId){
        AtomicInteger count = new AtomicInteger();
        bookList.forEach(element -> {
            if(element.categoryId == categoryId) count.getAndIncrement();
        });
        return count.get();
    }

    @Override
    public void output() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", descriptions='" + description + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }
    public static void printHorizontalLineWithBoundary() {
        System.out.println("+-----------------+-----------------+-----------------+-----------------+-----------------+----------------------+----------------------+");
    }
    public static void printTableHeaderWithBoundaryAndId() {
        printHorizontalLineWithBoundary();
        System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-20s | %-20s |%n", "Book id", "Book title","Author", "Publisher", "Year", "Description", "Category");
        printHorizontalLineWithBoundary();
    }
    public void printTableRowWithBoundaryAndId() {
        System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-20s | %-20s |%n",
                bookId, bookTitle, author, publisher, year, description, categoryId);
    }
    public static void printTableFooterWithBoundary() {
        printHorizontalLineWithBoundary();
    }
    public void printCategoryDataRow() {
        printTableRowWithBoundaryAndId();
    }
}
