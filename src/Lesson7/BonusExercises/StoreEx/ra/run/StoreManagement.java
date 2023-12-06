package Lesson7.BonusExercises.StoreEx.ra.run;

import java.util.Scanner;

public class StoreManagement {
    public void storeManagementMenu(Scanner scanner){
        int choice;
        boolean isExit = false;
        do{
            System.out.println("*********************STORE MANAGEMENT*****************\n" +
                    "1. Product management.\n" +
                    "2. Employee management.\n" +
                    "3. Receipt management.\n" +
                    "4. Bill management.\n" +
                    "5. Statistical report.\n" +
                    "6. Exit.\n" +
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
                    isExit = true;
                    break;
                default:
                    System.err.println("you enter wrong choice value\n" +
                            "Please re enter correct choice value.");
            }
        }while(!isExit);
    }
}
