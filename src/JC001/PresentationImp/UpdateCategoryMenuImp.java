package JC001.PresentationImp;

import JC001.Utilities.CommonHandles;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class UpdateCategoryMenuImp {
    public void displayMenu(Scanner scanner){
        boolean isExit = false;
        int choice;
        do{
            AtomicInteger menuIndex = new AtomicInteger(1);
            System.out.println("===== UPDATE CATEGORY =====");
            System.out.println(menuIndex.getAndIncrement() + ". Update category name.");
            System.out.println(menuIndex.getAndIncrement() + ". Change category status.");
            System.out.println(menuIndex.getAndIncrement() + ". Back.");
            choice = CommonHandles.choiceInteger(scanner);
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    isExit = true;
                    break;
                default:
                    System.err.println("You enter wrong choice value, please try again.");;
            }
        }while (!isExit);
    }
}
