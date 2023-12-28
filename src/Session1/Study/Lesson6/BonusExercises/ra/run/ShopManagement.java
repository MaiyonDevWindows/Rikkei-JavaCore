package Session1.Study.Lesson6.BonusExercises.ra.run;

import Session1.Study.Lesson6.BonusExercises.ra.entity.Categories;
import Session1.Study.Lesson6.BonusExercises.ra.entity.Products;

import java.util.Scanner;

public class ShopManagement {
    public void displayShopMenu(Scanner scanner, Categories[] categories, int currentCategoriesIndex,
                                Products[] products, int currentProductsIndex) {
        int choice;
        do{
            System.out.println("******************SHOP MENU*******************\n" +
                    "1. Categories Management.\n" +
                    "2. Products Management.\n" +
                    "3. Exit.\n" +
                    "Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    CategoryManagement categoryManagement = new CategoryManagement();
                    categoryManagement.displayCategoryMenu(scanner, categories, currentCategoriesIndex);
                    break;
                }
                case 2:{
                    ProductManagement productManagement = new ProductManagement();
                    productManagement.displayProductMenu(scanner, products, currentProductsIndex);
                    break;
                }
                case 3:{
                    System.out.println("End program.");
                    System.exit(0);
                }
                default:
                    System.err.println("Please enter correct choice value (1 - 3).");
            }
        }while(true);
    }
}
