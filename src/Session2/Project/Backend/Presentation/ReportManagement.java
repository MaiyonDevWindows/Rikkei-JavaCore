package Session2.Project.Backend.Presentation;

import Session2.Project.Backend.Utilities.CommonHandles;

import java.util.Scanner;

public class ReportManagement implements IManagement {
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.print("""
                    |===============REPORT MANAGEMENT===============|
                    1. Cost statistics by day, month, year.
                    2. Cost statistics by time period.
                    3. Revenue statistics by day, month, year.
                    4. Revenue statistics by time period.
                    5. Statistics on the number of employees by each status.
                    6. Statistics on most imported products in a period of time.
                    7. Statistics on imported products at least over a period of time.
                    8. Statistics of products produced the most in a period of time.
                    9. Statistics on products produced at least over a period of time.
                    10. Back.
                    """);
            choice = CommonHandles.inputChoice(scanner);
            switch (choice){
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
                case 7: break;
                case 8: break;
                case 9: break;
                case 10:
                    isExit = true;
                    break;
                default:
                    System.err.println("Your choice is not valid value, please try again.");
            }
        }while(!isExit);
    }
}
