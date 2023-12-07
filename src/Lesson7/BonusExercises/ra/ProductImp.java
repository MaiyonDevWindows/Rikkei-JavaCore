package Lesson7.BonusExercises.ra;

import Lesson7.BonusExercises.ra.entity.Product;

import java.util.Scanner;

public class ProductImp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] arrProduct = new Product[100];
        int arrIndex = 0, choice;
        do {
            System.out.println("***********************MENU**************************\n" +
                    "1. Insert n products (n enter from keyboard).\n" +
                    "2. Display products data.\n" +
                    "3. Calculate product profit.\n" +
                    "4. Sort products by profit desc.\n" +
                    "5. Count products by price range.\n" +
                    "6. Find products by product name.\n" +
                    "7. Add quantity product by product id.\n" +
                    "8. Sell product by product name.\n" +
                    "9. Upgrade product status.\n" +
                    "10. Exit program.\n" +
                    "Please enter your choice value: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
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
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.err.println("Please enter correct choice value (1 - 10).");
            }
        } while (true);
    }
}
