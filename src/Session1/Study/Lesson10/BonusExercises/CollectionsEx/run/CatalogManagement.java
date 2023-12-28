package Session1.Study.Lesson10.BonusExercises.CollectionsEx.run;

import java.util.Scanner;

public class CatalogManagement {
    public void displayCatalogManagement(Scanner scanner){
        int choice;
        boolean isExit = false;
        do{
            System.out.println("***************** CATALOG MANAGEMENT**************\n" +
                    "1. Add new category.\n" +
                    "2. Display categories data.\n" +
                    "3. Update category by category id.\n" +
                    "4. Delete category by category id.\n" +
                    "5. Exit.\n" +
                    "Please enter your choice value: ");
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
                    isExit = true;
                    break;
                default:
                    System.err.println("You enter wrong choice value, please try again.");;
            }
        }while(!isExit);
    }
}
