package Session2.Lesson6.Backend.Entity;

import java.util.Scanner;

public class Book {
    private int bookId;
    private String bookName;
    private float price;
    private String title;
    private String author;
    private boolean status;

    public Book() {
    }

    public Book(int bookId, String bookName, float price, String title, String author, boolean status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.title = title;
        this.author = author;
        this.status = status;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", status=" + status +
                '}';
    }
    public void inputData(Scanner scanner){
        System.out.print("Please enter book name: ");
        this.bookName = scanner.nextLine();
        System.out.print("Please enter book price: ");
        this.price = Float.parseFloat(scanner.nextLine());
        System.out.print("Please enter book title: ");
        this.title = scanner.nextLine();
        System.out.print("Please enter book author: ");
        this.author = scanner.nextLine();
        System.out.print("Please enter book status: ");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }
    public void displayData(){
        System.out.printf("Book id: %d - book name: %s - price: %.2f\n", bookId, bookName, price);
        System.out.printf("Title: %s - Author: %s - status: %s\n", title, author, status ? "active" : "inactive");
    }
}
