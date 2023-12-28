package Session2.Lesson7;

import Session2.Lesson7.Presentation.ShopManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShopManagement shopManagement = new ShopManagement();
        shopManagement.displayMenu(scanner);
        System.out.println("Exit program successfully.");
    }
}