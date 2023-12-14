package JC001.BusinessImp;

import JC001.EntityImp.Category;
import JC001.Utilities.InputHandles;
import JC001.Utilities.OutputHandles;

import java.util.Comparator;
import java.util.Scanner;

public class CategoryBusiness extends DataManagerImp<Category>{
    public void addNewCategories(Scanner scanner) {
        System.out.print("Please enter n value to add new categories: ");
        int n = InputHandles.inputInteger(scanner);
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter category %d data\n", i + 1);
            Category category = new Category();
            category.input(scanner);
            addData(category);
        }
    }
    public void displayAllCategories(){
        System.out.println("Display all categories");
//        getDataList().sort(new Comparator<Category>() {
//            @Override
//            public int compare(Category category1, Category category2) {
//                return category1.getCategoryName().compareToIgnoreCase(category2.getCategoryName());
//            }
//        });
        for (Category category : getDataList()) category.output();
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
        // Hiển thị list categories để chọn id và xoá.
        System.out.println("List categories in system: ");
        // Nhập category id để xoá.
        System.out.print("Please enter category id to delete: ");
        int categoryDeleteId = InputHandles.inputInteger(scanner);
        // Kiểm tra xem category ấy có tồn tại không.
        if (Category.isExistCategoryId(categoryDeleteId)){
            System.out.print(OutputHandles.stringWarning("Are you sure want to delete (Yes/No): "));
            if(InputHandles.inputConfirmValue(scanner)){
                Category.categoriesList.removeIf(category -> category.getCategoryId() == categoryDeleteId);
                System.out.println(OutputHandles.stringSuccess("Delete category successfully!"));
            }
        }else{
            System.err.println("Can not delete element cause category id is not exist!");
        }
    }
}