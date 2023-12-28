package Session1.Study.Lesson10.BonusExercises.CollectionsEx.run;

import java.util.Scanner;

public class ShopManagement {
    public void displayShopManagement(Scanner scanner){
        int choice;
        boolean isExit = false;
        do{
            System.out.println("*************************SHOP MANAGEMENT***************\n" +
                    "1. Categories management.\n" +
                    "2. Products management.\n" +
                    "3. Exit.\n" +
                    "Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
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
        }while(!isExit);
    }
}