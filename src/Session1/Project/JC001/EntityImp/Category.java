package Session1.Project.JC001.EntityImp;

import Session1.Project.JC001.BusinessImp.BookBusiness;
import Session1.Project.JC001.Entity.IEntity;
import Session1.Project.JC001.Utilities.InputHandles;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Category implements IEntity, Serializable {
    private List<Category> categoryList;
    private int categoryId;
    private String categoryName;
    private boolean categoryStatus;

    public Category() {
    }
    public Category(List<Category> categoryList){
        this.categoryList = categoryList;
    }

    public Category(int categoryId, String categoryName, boolean categoryStatus) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryStatus = categoryStatus;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean isCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(boolean categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    @Override
    public void input(Scanner scanner) {
        this.categoryId = generateCategoryId();
        this.categoryName = inputCategoryName(scanner);
        this.categoryStatus = inputCategoryStatus(scanner);
    }
    public int generateCategoryId(){
        int maxCategoryId = 0;
        if(!categoryList.isEmpty()){
            for (Category category : categoryList) {
                if (category.getCategoryId() > maxCategoryId)
                    maxCategoryId = category.getCategoryId();
            }
        }
        return maxCategoryId + 1;
    }
    public String inputCategoryName(Scanner scanner){
        System.out.print("Please enter category name: ");
        String categoryName = InputHandles.inputString(scanner);
        while (!isValidateCategoryName(categoryName) || isExistCategoryName(categoryName))
            categoryName = InputHandles.inputString(scanner);
        return capitalizeString(categoryName);
    }
    public boolean isValidateCategoryName(String categoryName){
        if(categoryName.length() < 6 || categoryName.length() > 30){
            System.err.println("Your category name must in range 6 and 30 characters!");
            System.err.println("Please enter valid category name value!");
            return false;
        }
        return true;
    }
    public boolean isExistCategoryId(int categoryId){
        for (Category category : categoryList) {
            if (category.getCategoryId() == categoryId)
                return true;
        }
        return false;
    }
    public boolean isExistCategoryName(String categoryName){
        for (Category category : categoryList) {
            if (category.getCategoryName().equals(categoryName)) {
                System.err.println("Your category name is exist, please enter another category name value!");
                return true;
            }
        }
        return false;
    }
    public String capitalizeString(String inputString){
        return inputString.substring(0, 1).toUpperCase() + inputString.substring(1).toLowerCase();
    }
    public boolean inputCategoryStatus(Scanner scanner){
        System.out.print("Please enter category status: ");
        categoryStatus = InputHandles.inputBoolean(scanner);
        return categoryStatus;
    }

    @Override
    public void output() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryStatus=" + categoryStatus +
                '}';
    }
    public void statisticsNumberOfBooksByCategory(BookBusiness bookBusiness){
        Book book = new Book(bookBusiness.getDataList());
        System.out.printf("| %-15s | %-20s | %-15s |%n",
                this.categoryId, this.categoryName, book.getNumberOfBooksByCategoryId(categoryId));
    }
    public static void printHorizontalLineWithBoundary() {
        System.out.println("+-----------------+----------------------+-----------------+");
    }
    public static void printTableHeaderWithBoundaryAndId() {
        printHorizontalLineWithBoundary();
        System.out.printf("| %-15s | %-20s | %-15s |%n", "Category id", "Category name","Status");
        printHorizontalLineWithBoundary();
    }
    public static void printTableHeaderWithBoundaryAndIdStatistics() {
        printHorizontalLineWithBoundary();
        System.out.printf("| %-15s | %-20s | %-15s |%n", "Category id", "Category name","Number of books");
        printHorizontalLineWithBoundary();
    }
    public void printTableRowWithBoundaryAndId() {
        System.out.printf("| %-15s | %-20s | %-15s |%n",
                this.categoryId, this.categoryName, this.categoryStatus ? "Available" : "Unavailable");
    }
    public static void printTableFooterWithBoundary() {
        printHorizontalLineWithBoundary();
    }
}