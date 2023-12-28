package Session1.Study.Lesson7.Classroom.ra.entity;

import java.util.Scanner;

public class Book {
    private String bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String author;
    private float interest;
    private int year;

    public Book() {
    }

    public Book(String bookId, String bookName, float importPrice, float exportPrice, String author, float interest, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.interest = interest;
        this.year = year;
    }

    public String getBookId() {
        return bookId;
    }
    public void setBookId(String bookId){
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

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void inputBookData(Scanner scanner, Book[] booksArr, int currentIndex){
        // Mã sách không được trùng lặp.
        String tempString;
        boolean isExist;
        do {
            isExist = false;
            System.out.print("Please enter book id: ");
            tempString = scanner.nextLine();
            for (int i = 0; i < currentIndex; i++) {
                if (tempString.equals(booksArr[i].getBookId())){
                    isExist = true;
                    break;
                }
            }
        }while(isExist);
        this.setBookId(tempString);
        // Tên sách không trùng lặp, gồm 4 ký tự, bắt đầu bằng chữ B.
        do{
            isExist = false;
            System.out.println("Please enter book name\n" +
                    "(no duplicates, consists of 4 characters and begins with the letter B):");
            tempString = scanner.nextLine();
            for (int i = 0; i < currentIndex; i++) {
                if (tempString.equals(booksArr[i].getBookName())){
                    isExist = true;
                    break;
                }
            }
        }while (tempString.length() != 4 || tempString.charAt(0) == 'B' || isExist);
        this.setBookName(tempString);
        // Import price: giá trị phải lớn hơn 0.
        do{
            System.out.print("Please enter import price: ");
            this.importPrice = Float.parseFloat(scanner.nextLine());
        }while(this.getImportPrice() <= 0);
        // Export price: có giá trị lớn hơn ít nhất 30% so với giá nhập.
        do{
            System.out.print("Please enter import price: ");
            this.exportPrice = Float.parseFloat(scanner.nextLine());
        }while(this.getExportPrice() <= 1.3f * this.getImportPrice());
        // Author: có từ 6 - 50 ký tự.
        do{
            System.out.println("Please enter author name (6 - 50 characters): ");
            this.author = scanner.nextLine();
        }while(this.getAuthor().length() < 6 || this.getAuthor().length() > 50);
        this.interest = this.exportPrice - this.importPrice;
        do{
            System.out.print("Please enter publish year: ");
            this.year = Integer.parseInt(scanner.nextLine());
        }while(this.getYear() <= 2000);
    }
    public float interestCalc(){
        return interest = exportPrice - importPrice;
    }
    public void displayBookData(){
        System.out.printf("Book id: %s - Book name:%s,\n" +
                "import price: %.2f - export price: %.2f,\n" +
                "author: %s - interest: %.2f - year: %d.\n", this.getBookId(), this.getBookName(),
                this.getImportPrice(), this.getExportPrice(), this.getAuthor(), this.getInterest(), this.getYear());
    }

}
