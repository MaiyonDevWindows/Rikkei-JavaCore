package JC001.BusinessImp;

import JC001.EntityImp.Category;
import JC001.Utilities.InputHandles;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class CategoryBusinessImp {
    public static void addNewCategories(Scanner scanner) {
        System.out.print("Please enter n value to add new categories: ");
        int n = InputHandles.inputInteger(scanner);
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
    public static void statisticsByEachCategory(){
        System.out.println("Statistics on the number of books by each category: ");
        Category.categoriesList.forEach(element -> System.out.println(element.statisticsNumberOfBooksByCategory()));
    }
    public static void updateCategoryById(Scanner scanner){
        System.out.print("Please enter category id to update data: ");
        int categoryUpdateId = InputHandles.inputInteger(scanner);
        while (!Category.isExistCategoryId(categoryUpdateId)){
            System.err.print("Your update category id is not exist!\n" +
                    "Please enter another category id to update data: ");
            categoryUpdateId = InputHandles.inputInteger(scanner);
        }
    }
    public static void deleteCategoryById(Scanner scanner){
        // Nhập category id để xoá.
        System.out.print("Please enter category id to delete: ");
        int categoryDeleteId = InputHandles.inputInteger(scanner);
        // Kiểm tra xem category ấy có tồn tại không.
        if (Category.isExistCategoryId(categoryDeleteId)){
            System.out.print("Are you sure want to delete (Yes/No): ");
            if(InputHandles.inputConfirmValue(scanner))
                Category.categoriesList.removeIf(category -> category.getCategoryId() == categoryDeleteId);
        }else{
            System.err.println("Can not delete element cause category id is not exist!");
        }
    }
}