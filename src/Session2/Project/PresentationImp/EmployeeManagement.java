package Session2.Project.PresentationImp;

import Session2.Project.Presentation.IManagement;

import java.util.Scanner;

public class EmployeeManagement implements IManagement {
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.println("""
                    ******************EMPLOYEE MANAGEMENT****************
                    1. Display all employees data.
                    2. Add new employees.
                    3. Update employee data.
                    4. Change employee status.
                    5. Search for employees.
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
