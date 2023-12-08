package Lesson10.BonusExercises.CollectionsEx.run;

import java.util.Scanner;

public class ProductManagement {
    public void displayProductManagement(Scanner scanner){
        int choice;
        boolean isExit = false;
        do{
            System.out.println("***************** PRODUCT MANAGEMENT**************\n" +
                    "1. Add new product.\n" +
                    "2. Display products data.\n" +
                    "3. Update product by product id.\n" +
                    "4. Delete product by product id.\n" +
                    "5. Sort product by price Asc.\n" +
                    "6. Sort product by product name Asc.\n" +
                    "7. Thống kê số lượng sản phẩm theo danh mục sản phẩm.\n" +
                    "8. Find product by product name.\n" +
                    "9. Exit.\n" +
                    "Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    isExit = true;
                    break;
                default:
                    System.err.println("You enter wrong choice value, please try again.");;
            }
        }while(!isExit);
    }
}
