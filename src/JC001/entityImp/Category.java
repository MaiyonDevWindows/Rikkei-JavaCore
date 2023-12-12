package JC001.entityImp;

import JC001.entity.IEntity;
import JC001.utilities.InputDataMethods;
import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Category implements IEntity {
    public static List<Category> categoriesList = new ArrayList<Category>();
    private int categoryId;
    private String categoryName;
    private boolean categoryStatus;

    public Category() {
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
        if(!categoriesList.isEmpty()){
            for (Category category : categoriesList) {
                if (category.getCategoryId() > maxCategoryId)
                    maxCategoryId = category.getCategoryId();
            }
        }
        return maxCategoryId + 1;
    }
    public String inputCategoryName(Scanner scanner){
        System.out.print("Please enter category name: ");
        String categoryName = InputDataMethods.inputString(scanner);
        while (!isValidateCategoryName(categoryName) || isExistCategoryName(categoryName))
            categoryName = InputDataMethods.inputString(scanner);
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
    public boolean isExistCategoryName(String categoryName){
        Iterator<Category> categoryIterator = categoriesList.iterator();
        while (categoryIterator.hasNext()){
            if (categoryIterator.next().getCategoryName().equals(categoryName)){
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
        categoryStatus = InputDataMethods.inputBoolean(scanner);
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
}