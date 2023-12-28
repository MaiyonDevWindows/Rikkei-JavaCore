package Session2.Lesson7.Presentation;


import Session2.Lesson7.Utils.CommonHandles;

import java.util.Scanner;

public class ShopManagement implements IManagement{
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.println("*************SHOP MANAGEMENT****************\n" +
                    "1. Category Management.\n" +
                    "2. Product Management.\n" +
                    "3. Exit.");
            choice = CommonHandles.enterChoice(scanner);
            switch (choice){
                case 1:
                    CategoryManagement categoryManagement = new CategoryManagement();
                    categoryManagement.displayMenu(scanner);
                    break;
                case 2:
                    ProductManagement productManagement = new ProductManagement();
                    productManagement.displayMenu(scanner);
                    break;
                case 3:
                    isExit = true;
                    break;
                default:
                    System.err.println("Your choice is not valid value, please try again.");
            }
        }while(!isExit);
    }
}
