package Lesson6.BonusEx.ra.run;

import Lesson6.BonusEx.ra.entity.Categories;

import java.util.Scanner;

public class CategoryManagement {
    public void displayCategoryMenu(Scanner scanner, Categories[] categories, int currentCategoriesIndex) {
        int choice;
        boolean isExit = false;
        do{
            System.out.println("********************CATEGORIES MENU***********\n" +
                    "1. Categories data input.\n" +
                    "2. Categories data display.\n" +
                    "3. Update category data.\n" +
                    "4. Delete category.\n" +
                    "5. Update category status.\n" +
                    "6. Exit.\n" +
                    "Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    System.out.println("Categories data input: ");
                    Categories categories1 = new Categories();
                    categories1.inputData(scanner, categories, currentCategoriesIndex);
                    break;
                }
                case 2:{
                    System.out.println("Categories data display: ");
                    break;
                }
                case 3:{
                    System.out.println("Categories data update: ");
                    break;
                }
                case 4:{
                    System.out.println("Category delete: ");
                    break;
                }
                case 5:{
                    System.out.println("Category status update: ");
                    break;
                }
                case 6: {
                    isExit = true;
                    break;
                }
                default:
                    System.err.println("Please enter correct choice value (1 - 6).");
            }
        }while (!isExit);
    }
}
