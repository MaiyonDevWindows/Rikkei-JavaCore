package Session1.Project.JC001.PresentationImp;

import Session1.Project.JC001.Presentation.IManagementMenu;
import Session1.Project.JC001.Utilities.CommonHandles;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class LibraryManagementImp implements IManagementMenu {
    @Override
    public void displayMenu(Scanner scanner){
        boolean isExit = false;
        int choice;
        do {
            AtomicInteger menuIndex = new AtomicInteger(1);
            System.out.println("===== LIBRARY MANAGEMENT =====");
            System.out.println(menuIndex.getAndIncrement() + ". Category management.");
            System.out.println(menuIndex.getAndIncrement() + ". Book management");
            System.out.println(menuIndex.getAndIncrement() + ". Exit.");
            choice = CommonHandles.choiceInteger(scanner);
            switch (choice){
                case 1:
                    CategoryManagementImp categoryManagement = new CategoryManagementImp();
                    categoryManagement.displayMenu(scanner);
                    break;
                case 2:
                    BookManagementImp bookManagement = new BookManagementImp();
                    bookManagement.displayMenu(scanner);
                    break;
                case 3:
                    isExit = true;
                    break;
                default:
                    System.err.println("You enter wrong choice value, please try again.");
            }
        }while (!isExit);
    }
}
