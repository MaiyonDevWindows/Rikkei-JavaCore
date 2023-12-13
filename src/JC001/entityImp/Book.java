package JC001.entityImp;

import JC001.entity.IEntity;
import JC001.utilities.InputHandles;

import java.time.Year;
import java.util.*;
import java.util.regex.Pattern;

public class Book implements IEntity {
    public static List<Book> booksList = new ArrayList<>();
    private String bookId;
    private String bookTitle;
    private String author;
    private String publisher;
    private int year;
    private String description;
    private int categoryId;

    public Book() {
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
        Iterator<Book> bookIterator = booksList.iterator();
        while (bookIterator.hasNext())
            if (bookIterator.next().bookId.equals(bookId)) {
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
        Iterator<Book> bookIterator = booksList.iterator();
        while (bookIterator.hasNext())
            if (bookIterator.next().bookTitle.equals(bookTitle)) {
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
        System.out.print("Please enter book 's category id: ");
        return InputHandles.inputInteger(scanner);
        // Kiểm tra xem trong CategoryList có trường nào không.
        // Nếu không có thì serr ra lỗi và quay lại.
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
    public static int getNumberOfBooksByCategoryId(int categoryId){
        Iterator<Book> bookIterator = booksList.iterator();
        int count = 0;
        while (bookIterator.hasNext()){
            if(bookIterator.next().categoryId == categoryId)
                count++;
        }
        return count;
    }
}
