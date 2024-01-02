package Session2.Lesson6.Backend.Presentation;

import Session2.Lesson6.Backend.Business.BookBusiness;
import Session2.Lesson6.Backend.Entity.Book;

import java.util.List;
import java.util.Scanner;

/*
- Đây là cách viết dài dòng thôi,
còn thực tế khi viết sản phẩm chúng ta không cần làm những cái rườm rà như logic trong CRUD,
đây là bài demo của thầy mọc ra nhiều trường hợp vô lý để m.n hiểu được cách hoạt động từng câu lệnh.
 */
public class BookPresentation {
    private static BookBusiness bookBusiness = new BookBusiness();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("""
                ===============Book management===============
                1. Display all books.
                2. Create a new book.
                3. Update book data.
                4. Delete book.
                5. Exit.
                """);
            System.out.print("Please enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    List<Book> bookList = bookBusiness.getAll();
                    bookList.forEach(Book::displayData);
                    break;
                case 2:
                    Book book = new Book();
                    book.inputData(scanner);
                    boolean resultCreate = bookBusiness.create(book);
                    if(resultCreate) System.out.println("Create a new book successfully.");
                    else System.err.println("Create a new book failure.");
                    break;
                case 3:
                    System.out.println("Please enter book id to update: ");
                    int bookIdUpdate = Integer.parseInt(scanner.nextLine());
                    Book bookUpdate = new Book();
                    bookUpdate.setBookId(bookIdUpdate);
                    bookUpdate.inputData(scanner);
                    boolean resultUpdate = bookBusiness.update(bookUpdate);
                    if(resultUpdate) System.out.println("Update book successfully.");
                    else System.err.println("Update book failure.");
                    break;
                case 4:
                    System.out.println("Please enter book id to delete: ");
                    int bookIdDel = Integer.parseInt(scanner.nextLine());
                    boolean resultDelete = bookBusiness.delete(bookIdDel);
                    if(resultDelete) System.out.println("Delete book successfully.");
                    else System.err.println("Delete book failure.");
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Your choice is not valid value, please try again.");
            }
        }while (true);
    }
}
