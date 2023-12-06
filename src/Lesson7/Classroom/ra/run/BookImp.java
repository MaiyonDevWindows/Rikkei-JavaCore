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
            switch (choice) {
                case 1:
                    int n;
                    Book tempBook = new Book();
                    System.out.println("Please enter the number of books to insert information: ");
                    n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        tempBook.inputBookData(scanner, booksArr, currentIndex);
                        booksArr[currentIndex] = tempBook;
                        currentIndex++;
                    }
                    break;
                case 2:
                    System.out.println("Calculate books interest.");
                    for (int i = 0; i < currentIndex; i++)
                        booksArr[i].interestCalc();
                    break;
                case 3:
                    System.out.println("Display all books information: ");
                    for (int i = 0; i < currentIndex; i++) booksArr[i].displayBookData();
                    break;
                case 4:
                    System.out.println("Arrange books by ascending price.");
                    selectionSortByExportPriceAsc(booksArr, currentIndex);
                    break;
                case 5:
                    System.out.println("Arrange books by descending interest.");
                    selectionSortByInterestDesc(booksArr, currentIndex);
                    break;
                case 6:
                    System.out.println("Find books by book name (book name enter from keyboard).");
                    String bookName;
                    do {
                        System.out.println("Please enter book name\n" +
                                "(consists of 4 characters and begins with the letter B):");
                        bookName = scanner.nextLine();
                    } while (bookName.length() != 4 || bookName.charAt(0) == 'B');
                    findAllBooksByName(bookName, booksArr, currentIndex);
                    break;
                case 7:
                    System.out.println("Do statistics on the number of books by year of publication.");
                    int publishYear;
                    do {
                        System.out.print("Please enter publish year: ");
                        publishYear = Integer.parseInt(scanner.nextLine());
                    } while (publishYear <= 2000);
                    System.out.printf("There are %d books published in %d\n",
                            countAllBooksByYear(publishYear, booksArr, currentIndex), publishYear);
                    break;
                case 8:
                    System.out.println("Do statistics on the number of books by author.");
                    String authorName;
                    do {
                        System.out.println("Please enter author name (6 - 50 characters): ");
                        authorName = scanner.nextLine();
                    } while (authorName.length() < 6 || authorName.length() > 50);
                    System.out.printf("There are %d books belonging to author %s\n",
                            countAllBooksByAuthor(authorName, booksArr, currentIndex), authorName);
                    break;
                case 9:
                    System.out.println("End program.");
                    System.exit(0);
                default:
                    System.err.println("Please enter correct choice value.");
            }
        } while (true);
    }

    public static void swapBook(Book bookA, Book bookB) {
        Book tempBook = bookA;
        bookA = bookB;
        bookB = tempBook;
    }

    public static void selectionSortByExportPriceAsc(Book[] booksArr, int currentIndex) {
        int minPriceObjIndex;
        for (int i = 0; i < currentIndex - 1; i++) {
            minPriceObjIndex = i;
            for (int j = i; j < currentIndex; j++) {
                if (booksArr[currentIndex].getExportPrice() < booksArr[minPriceObjIndex].getExportPrice())
                    minPriceObjIndex = currentIndex;
            }
            swapBook(booksArr[i], booksArr[minPriceObjIndex]);
        }
    }

    public static void selectionSortByInterestDesc(Book[] booksArr, int currentIndex) {
        int maxInterestObjIndex;
        for (int i = 0; i < currentIndex - 1; i++) {
            maxInterestObjIndex = i;
            for (int j = i + 1; j < currentIndex; j++) {
                if (booksArr[currentIndex].getInterest() > booksArr[maxInterestObjIndex].getInterest())
                    maxInterestObjIndex = currentIndex;
            }
            swapBook(booksArr[i], booksArr[maxInterestObjIndex]);
        }
    }

    public static void findAllBooksByName(String bookName, Book[] booksArr, int currentIndex) {
        for (int i = 0; i < currentIndex; i++) {
            if (booksArr[i].getBookName().equals(bookName))
                booksArr[i].displayBookData();
        }
    }

    public static int countAllBooksByYear(int publishYear, Book[] booksArr, int currentIndex) {
        int count = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (booksArr[i].getYear() == publishYear)
                count++;
        }
        return count;
    }

    private static int countAllBooksByAuthor(String authorName, Book[] booksArr, int currentIndex) {
        int count = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (booksArr[i].getAuthor().equals(authorName))
                count++;
        }
        return count;
    }
}
