package Session1.Study.Lesson11.BonusExercises.ExceptionFileEx.business.entity;

import Session1.Study.Lesson11.BonusExercises.ExceptionFileEx.business.entityImp.IBook;
import Session1.Study.Lesson11.BonusExercises.ExceptionFileEx.business.utils.inputMethods;

import java.text.SimpleDateFormat;
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
    public int generateBookId() {
        int idMax = 0;
        if (!booksList.isEmpty()) {
            for (Book book : booksList)
                if (book.bookId > idMax) idMax = book.bookId;
        }
        return idMax + 1;
    }

    @Override
    public String inputBookName(Scanner scanner) {
        System.out.print("Please enter book name: ");
        String bookName = scanner.nextLine();
        while (!validateBookName(bookName) || isExistBookName(bookName)){
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
        System.out.print("Please enter book import price: ");
        float importPrice = inputMethods.inputFloat(scanner);
        while(!validateImportPrice(importPrice)){
            System.err.println("Import price must be greater than 0");
            importPrice = inputMethods.inputFloat(scanner);
        }
        return importPrice;
    }

    @Override
    public boolean validateImportPrice(float importPrice) {
        return importPrice > 0;
    }

    @Override
    public float inputExportPrice(Scanner scanner) {
        System.out.print("Please enter book export price: ");
        float exportPrice = inputMethods.inputFloat(scanner);
        while(!validateExportPrice(exportPrice)){
            System.err.println("Export price must be greater than import price");
            exportPrice = inputMethods.inputFloat(scanner);
        }
        return exportPrice;
    }

    @Override
    public boolean validateExportPrice(float exportPrice) {
        return exportPrice > this.importPrice;
    }
    @Override
    public String inputAuthor(Scanner scanner) {
        System.out.print("Please enter author name: ");
        String authorName = scanner.nextLine();
        while (!validateAuthorName(authorName)){
            System.err.println("Author must be in range 6 - 50 characters");
            authorName = scanner.nextLine();
        }
        return authorName;
    }
    @Override
    public boolean validateAuthorName(String authorName) {
        return (authorName.length() >= 6 && authorName.length() <= 50);
    }
    @Override
    public Date inputCreatedDate(Scanner scanner) {
        System.out.print("Please enter create date: ");
        return inputMethods.inputDate(scanner);
    }
    @Override
    public String inputDescriptions(Scanner scanner) {
        System.out.print("Please enter descriptions: ");
        String descriptions = scanner.nextLine();
        while(!validateDescriptions(descriptions)){
            System.err.println("Descriptions max length is 500 characters");
            descriptions = scanner.nextLine();
        }
        return descriptions;
    }
    @Override
    public boolean validateDescriptions(String descriptions) {
        return descriptions.length() <= 500;
    }
    @Override
    public void inputData(Scanner scanner) {
        this.bookId = generateBookId();
        this.bookName = inputBookName(scanner);
        this.importPrice = inputImportPrice(scanner);
        this.exportPrice = inputExportPrice(scanner);
        this.author = inputAuthor(scanner);
        this.created = inputCreatedDate(scanner);
        this.descriptions = inputDescriptions(scanner);
    }
    @Override
    public void updateDataByBookId(Scanner scanner, int bookId) {
        for (Book book : booksList) {
            if (book.getBookId() == bookId) {
                book.setBookName(inputBookName(scanner));
                book.setImportPrice(inputImportPrice(scanner));
                book.setExportPrice(inputExportPrice(scanner));
                book.setAuthor(inputAuthor(scanner));
                book.setCreated(inputCreatedDate(scanner));
                book.setDescriptions(inputDescriptions(scanner));
                break;
            }
        }
    }
    @Override
    public void displayData() {
        System.out.printf("Book id: %s - book name: %s - author: %s - created: %s,\n" +
                "import price: %.2f - export price: %.2f,\n" +
                "descriptions: %s", bookId, bookName, author, created.toString(), importPrice, exportPrice, descriptions);
    }
}