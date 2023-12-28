package Session2.Project.Backend.PresentationImp;

import Session2.Project.Backend.Presentation.IManagement;

import java.util.Scanner;

public class ProductManagement implements IManagement {
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.println("""
                    ******************PRODUCT MANAGEMENT****************
                    1. Display all products data.
                    2. Add new products.
                    3. Update product data.
                    4. Search for products.
                    5. Change product status.
                    6. Back.""");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6:
                    isExit = true;
                    break;
                default:
                    System.err.println("Your choice is not valid value, please try again.");
            }
        }while (!isExit);
    }
}
