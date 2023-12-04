package Lesson6.Classroom.ra.entity;

/*
1. Xây dựng lớp Book trong package ra.entity gồm các thông tin sau:
- Thuộc tính: mã sách, tên sách, giá nhập, giá xuất, tiêu đề, tác giả, nhà xuất bản
- Có 2 constructor: không tham số và đầy đủ tham số khởi tạo tất cả thông tin sách
- Phương thức:
    + inputData(Scanner scanner): Nhập các thông tin sách (trừ giá xuất)
    + displayData(): Hiển thị tất cả thông tin sách
    + calExportPrice(): Tính giá xuất theo công thức: exportPrice = importPrice*1.2;
*/

import java.util.Scanner;

public class Book {
    private String bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String title;
    private String author;
    private String companyPublisher;
    public Book(){

    }
    public Book(String bookId, String bookName,
                float importPrice, float exportPrice, String title, String author, String companyPublisher){
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.title = title;
        this.author = author;
        this.companyPublisher = companyPublisher;
    }
    public String getBookId(){
        return bookId;
    }
    public String getBookName(){
        return bookName;
    }
    public float getImportPrice(){
        return importPrice;
    }
    public float getExportPrice(){
        return exportPrice;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getCompanyPublisher(){
        return companyPublisher;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public void setImportPrice(float importPrice){
        this.importPrice = importPrice;
    }
    public void setExportPrice(float exportPrice){
        this.exportPrice = exportPrice;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setCompanyPublisher(String companyPublisher){
        this.companyPublisher = companyPublisher;
    }
    public void inputData(Scanner scanner){
        System.out.print("Please enter book 's id: ");
        bookId = scanner.nextLine();
        System.out.print("Please enter book 's name : ");
        bookName = scanner.nextLine();
        System.out.print("Please enter book 's import price: ");
        importPrice = Float.parseFloat(scanner.nextLine());
        System.out.print("Please enter book 's export price: ");
        exportPrice = Float.parseFloat(scanner.nextLine());
        System.out.print("Please enter book 's title: ");
        title = scanner.nextLine();
        System.out.print("Please enter book 's author: ");
        author = scanner.nextLine();
        System.out.print("Please enter book 's company publisher: ");
        companyPublisher = scanner.nextLine();
    }
    public void displayData(){
        System.out.printf("Book Id: %s - Book name: %s\n", bookId, bookName);
        System.out.printf("Import price: %.2f - Export price: %.2f\n", importPrice, exportPrice);
        System.out.printf("Title: %s - Author: %s - Publisher: %s\n", title, author, companyPublisher);
    }
    public float calExportPrice(){
        return this.exportPrice = this.importPrice * 1.2f;
    }
}
