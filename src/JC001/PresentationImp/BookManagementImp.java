package JC001.PresentationImp;

import JC001.BusinessImp.BookBusiness;
import JC001.BusinessImp.CategoryBusiness;
import JC001.EntityImp.Book;
import JC001.EntityImp.Category;
import JC001.Presentation.IManagementMenu;
import JC001.Utilities.CommonHandles;
import JC001.Utilities.DataFilePaths;
import JC001.Utilities.InputHandles;
import JC001.Utilities.OutputHandles;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class BookManagementImp implements IManagementMenu {
    @Override
    public void displayMenu(Scanner scanner) {
        CategoryBusiness categoryBusiness = new CategoryBusiness();
        BookBusiness bookBusiness = new BookBusiness();
        boolean isExit = false;
        int choice;
        do {
            bookBusiness.readDataFromFile(DataFilePaths.booksDataFile);
            categoryBusiness.readDataFromFile(DataFilePaths.categoriesDataFile);
            AtomicInteger menuIndex = new AtomicInteger(1);
            System.out.println("===== BOOK MANAGEMENT =====");
            System.out.println(menuIndex.getAndIncrement() + ". Add new books.");
            System.out.println(menuIndex.getAndIncrement() + ". Update book data.");
            System.out.println(menuIndex.getAndIncrement() + ". Delete book by book id.");
            System.out.println(menuIndex.getAndIncrement() + ". Find book by book name.");
            System.out.println(menuIndex.getAndIncrement() + ". Display by book 's category.");
            System.out.println(menuIndex.getAndIncrement() + ". Back.");
            choice = CommonHandles.choiceInteger(scanner);
            switch (choice){
                case 1:
                    bookBusiness.addNewBooks(categoryBusiness.getDataList() ,scanner);
                    bookBusiness.writeDataToFile(DataFilePaths.booksDataFile);
                    break;
                case 2:
                    // bookBusiness.updateBookData(scanner);

                    break;
                case 3:
                    // BookBusiness.deleteBookById(scanner);
                    bookBusiness.readDataFromFile(DataFilePaths.booksDataFile);
                    System.out.println("Please enter book id to delete: ");
                    List<Book> bookList = bookBusiness.getDataList();
                    Book book = new Book(bookList);
                    String delBookId = InputHandles.inputString(scanner);
                    int index=-1;
                    for (int i = 0; i < bookList.size(); i++) {
                        if(bookList.get(i).getBookId().equals(delBookId)){
                            index=i;
                            break;
                        }
                    }
                    if(index == -1){
                        System.err.println("Book id is not exist.");
                    }else{
                        bookList.remove(index);
                        System.out.println(OutputHandles.stringSuccess("Delete book successfully."));
                    }
                    bookBusiness.writeDataToFile(DataFilePaths.booksDataFile);
                    break;
                case 4:
                    bookBusiness.findBookByBookName(scanner);
                    break;
                case 5:
                    // BookBusiness.displayBooksByCategory(scanner);
                    categoryBusiness.readDataFromFile(DataFilePaths.categoriesDataFile);
                    bookBusiness.readDataFromFile(DataFilePaths.booksDataFile);
                    List<Book> bookList1 = bookBusiness.getDataList();
                    List<Category> categoryList = categoryBusiness.getDataList();

                    Map<String, List<Book>> categoryNameToBooksMap = categoryList.stream()
                            .collect(Collectors.toMap(
                                    Category::getCategoryName,
                                    categoryTemp -> bookList1.stream()
                                            .filter(bookTemp -> bookTemp.getCategoryId() == categoryTemp.getCategoryId())
                                            .collect(Collectors.toList())
                            ));
                    categoryNameToBooksMap.forEach((categoryName, books) -> {
                        System.out.println("Category Name: " + categoryName);
                        System.out.println("Books:");
                        books.forEach(bookTemp -> System.out.println(" - " + bookTemp.getBookTitle()));
                        System.out.println();
                    });
                    break;
                case 6:
                    isExit = true;
                    break;
                case 7:
                    bookBusiness.displayAllBooks();
                    break;
                default:
                    System.err.println("You enter wrong choice value, please try again.");
            }
        }while (!isExit);
    }
}
