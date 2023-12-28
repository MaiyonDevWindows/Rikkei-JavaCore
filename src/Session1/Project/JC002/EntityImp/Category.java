package Session1.Project.JC002.EntityImp;

import Session1.Project.JC002.Entity.ICategory;

import java.util.Scanner;

public class Category implements ICategory {
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
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryStatus=" + categoryStatus +
                '}';
    }

    @Override
    public void inputData(Scanner scanner) {

    }

    @Override
    public void displayData() {
        System.out.println(this.toString());
    }

}
