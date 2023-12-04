package Lesson6.BonusEx.ra.run;

import Lesson6.BonusEx.ra.entity.Categories;
import Lesson6.BonusEx.ra.entity.Products;

import java.util.Scanner;

public class ProgramMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Các biến toàn cục.
        Categories[] categories = new Categories[100];
        int currentCategoryIndex = 0;
        Products[] products = new Products[100];
        int currentProductIndex = 0;
        ShopManagement shopManagement = new ShopManagement();
        shopManagement.displayShopMenu(scanner, categories, currentCategoryIndex, products, currentProductIndex);
    }
}