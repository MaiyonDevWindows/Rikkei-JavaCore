package Session2.Project.Backend.PresentationImp;

import Session2.Project.Backend.Presentation.IManagement;

import java.util.Scanner;

public class ReceiptManagement implements IManagement {
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.println("""
                    ******************RECEIPT MANAGEMENT****************
                    1. List of Receipt
                    2. Insert Receipt
                    3. Update Receipt Information
                    4. Receipt Detail
                    5. Approve Receipt
                    6. Find Receipt
                    7. Back.""");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
                case 7:
                    isExit = true;
                    break;
                default:
                    System.err.println("Your choice is not valid value, please try again.");
            }
        }while (!isExit);
    }
}
