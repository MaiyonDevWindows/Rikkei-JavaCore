package Lesson10.BonusExercises.CollectionsEx.run;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShopManagement shopManagement = new ShopManagement();
        shopManagement.displayShopManagement(scanner);
    }
}
