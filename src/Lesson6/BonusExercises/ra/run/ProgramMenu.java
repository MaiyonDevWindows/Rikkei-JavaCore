package Lesson6.BonusExercises.ra.run;

import Lesson6.BonusExercises.ra.entity.Categories;
import Lesson6.BonusExercises.ra.entity.Products;

import java.util.Scanner;

public class ProgramMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Các biến toàn cục.
        Categories[] categories = new Categories[100];
        int categoryIndex = 0;
        Products[] products = new Products[100];
        int productIndex = 0;
        ShopManagement shopManagement = new ShopManagement();
        shopManagement.displayShopMenu(scanner, categories, categoryIndex, products, productIndex);
    }
}