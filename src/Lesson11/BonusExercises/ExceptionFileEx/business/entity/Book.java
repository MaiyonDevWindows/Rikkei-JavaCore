package Lesson11.BonusExercises.ExceptionFileEx.business.entity;

import Lesson11.BonusExercises.ExceptionFileEx.business.entityImp.IBook;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Book implements IBook {
    public static List<Book> booksList = new ArrayList<>();
    private int bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String author;
    private Date created;
    private String descriptions;

    public Book() {
    }

    public Book(int bookId, String bookName, float importPrice, float exportPrice, String author, Date created,
                String descriptions) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.created = created;
        this.descriptions = descriptions;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public int generateBookId(Scanner scanner) {
        if (booksList.isEmpty()) {
            return 1;
        } else {
            int idMax = 0;
            for (Book book : booksList) {
                if (book.bookId > idMax) idMax = book.bookId;
            }
            return idMax + 1;
        }
    }

    @Override
    public String inputBookName(Scanner scanner) {
        System.out.println("Please enter book name: ");
        String bookName = scanner.nextLine();
        while (validateBookName(bookName) || !isExistBookName(bookName)){
            System.err.println("Book name must not be duplicated or formatted incorrectly");
            bookName = scanner.nextLine();
        }
        return bookName;
    }

    @Override
    public boolean validateBookName(String bookName) {
        return Pattern.matches("^B.{3}$", bookName);
    }

    @Override
    public boolean isExistBookName(String bookName) {
        for (Book book : booksList) {
            if (book.bookName.equals(bookName))
                return true;
        }
        return false;
    }

    @Override
    public float inputImportPrice(Scanner scanner) {
        return 0;
    }

    @Override
    public float inputExportPrice(Scanner scanner) {
        return 0;
    }

    @Override
    public String inputAuthor(Scanner scanner) {
        return null;
    }

    @Override
    public Date inputCreatedDay(Scanner scanner) {
        return null;
    }

    @Override
    public String inputDescriptions(Scanner scanner) {
        return null;
    }

    @Override
    public void inputData(Scanner scanner) {

    }

    @Override
    public void displayData() {
        System.out.printf("Book id: %s - book name: %s - author: %s - created: %s,\n" +
                "import price: %.2f - export price: %.2f,\n" +
                "descriptions: %s", bookId, bookName, author, created.toString(), importPrice, exportPrice, descriptions);
    }
}
