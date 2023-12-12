package JC001.businessImp;

import JC001.entityImp.Category;
import JC001.utilities.InputDataMethods;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class CategoryBusinessImp {
    public static void addNewCategories(Scanner scanner) {
        System.out.print("Please enter n value to add new categories: ");
        int n = InputDataMethods.inputInteger(scanner);
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter category %d data\n", i + 1);
            Category category = new Category();
            category.input(scanner);
            Category.categoriesList.add(category);
        }
    }

    public static void displayAllCategories(){
        System.out.println("Display all categories");
        Category.categoriesList.sort(new Comparator<Category>() {
            @Override
            public int compare(Category category1, Category category2) {
                return category1.getCategoryName().compareToIgnoreCase(category2.getCategoryName());
            }
        });
        Iterator<Category> categoryIterator = Category.categoriesList.iterator();
        while (categoryIterator.hasNext())
            categoryIterator.next().output();
    }
}