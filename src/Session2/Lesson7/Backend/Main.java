package Session2.Lesson7.Backend;

import Session2.Lesson7.Backend.Presentation.ShopManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShopManagement shopManagement = new ShopManagement();
        shopManagement.displayMenu(scanner);
        System.out.println("Exit program successfully.");
    }
}