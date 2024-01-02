package Session2.Project.Backend;

import Session2.Project.Backend.Presentation.LoginPresentation;

import java.util.Scanner;

public class WarehouseManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WAREHOUSE MANAGEMENT APPLICATION");
        LoginPresentation loginPresentation = new LoginPresentation();
        loginPresentation.displayMenu(scanner);
    }
}