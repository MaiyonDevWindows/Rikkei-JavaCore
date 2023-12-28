package Session1.Study.Lesson6.BonusExercises.ra.run;

import Session1.Study.Lesson6.BonusExercises.ra.entity.Products;

import java.util.Scanner;

public class ProductManagement {
    public void displayProductMenu(Scanner scanner, Products[] products, int currentProductsIndex){
        int choice;
        boolean isExit = false;
        do {
            System.out.println("*******************PRODUCT MANAGEMENT*****************\n" +
                    "1. Products data inputMethods.\n" +
                    "2. Display products data.\n" +
                    "3. Sort products by price.\n" +
                    "4. Update product data by product id.\n" +
                    "5. Delete product by product id.\n" +
                    "6. Find products by product name.\n" +
                    "7. Find products by price range.\n" +
                    "8. Exit.\n" +
                    "Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    System.out.println("Products data inputMethods: ");
                    break;
                }
                case 2:{
                    System.out.println("Display products data: ");
                    break;
                }
                case 3:{
                    System.out.println("Sort products by price: ");
                    break;
                }
                case 4:{
                    System.out.println("Update product data by product id: ");
                    break;
                }
                case 5:{
                    System.out.println("Delete product by product id: ");
                    break;
                }
                case 6:{
                    System.out.println("Find product by product name: ");
                    break;
                }
                case 7:{
                    System.out.println("Find product by price range: ");
                    break;
                }
                case 8:{
                    isExit = true;
                    break;
                }
                default:
                    System.err.println("Please enter valid choice value (1 - 8).");
            }
        }while (!isExit);
    }
}
