package Lesson7.Classroom.ra.run;

import Lesson7.Classroom.ra.entity.Book;

import java.util.Scanner;

public class BookImp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] booksArr = new Book[100];
        int currentIndex = 0, choice;
        do {
            System.out.println("*********************MENU******************\n" +
                    "1. Input n books information (n enter from keyboard).\n" +
                    "2. Calculate books interest.\n" +
                    "3. Display book information.\n" +
                    "4. Arrange books by ascending price.\n" +
                    "5. Arrange books by descending interest.\n" +
                    "6. Find books by book name (book name enter from keyboard).\n" +
                    "7. Do statistics on the number of books by year of publication.\n" +
                    "8. Do statistics on the number of books by author.\n" +
                    "9. Exit.\n" +
                    "Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    int n;
                    Book tempBook = new Book();
                    System.out.println("Please enter the number of books to insert information: ");
                    n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++){
                        tempBook.inputBookData(scanner, booksArr, currentIndex);
                        booksArr[currentIndex] = tempBook;
                        currentIndex++;
                    }
                    break;
                }
                case 2:{
                    System.out.println("Calculate books interest.");
                    for (int i = 0; i < currentIndex; i++)
                        booksArr[i].interestCalc();
                    break;
                }
                case 3:{
                    System.out.println("Display all books information: ");
                    for (int i = 0; i < currentIndex; i++) booksArr[i].displayBookData();
                    break;
                }
                case 4:{
                    System.out.println("Arrange books by ascending price.");
                    break;
                }
                case 5:{
                    System.out.println("Arrange books by descending interest.");
                    break;
                }
                case 6:{
                    System.out.println("Find books by book name (book name enter from keyboard).");
                    break;
                }
                case 7:{
                    System.out.println("Do statistics on the number of books by year of publication.");
                    break;
                }
                case 8:{
                    System.out.println("Do statistics on the number of books by author.");
                    break;
                }
                case 9:{
                    System.out.println("End program.");
                    System.exit(0);
                }
                default:
                    System.err.println("Please enter correct choice value.");
            }
        }while (true);
    }
}
