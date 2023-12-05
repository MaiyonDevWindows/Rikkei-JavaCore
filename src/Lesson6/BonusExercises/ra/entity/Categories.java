package Lesson6.BonusExercises.ra.entity;

import java.util.Scanner;

public class Categories {
    private int catalogId;
    private String catalogName;
    private String descriptions;
    private boolean catalogStatus;
    public Categories(){

    }
    public Categories(int catalogId, String catalogName, String descriptions, boolean catalogStatus){
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }
    public String getCatalogName(){
        return catalogName;
    }
    public String getDescriptions(){
        return descriptions;
    }
    public boolean getCatalogStatus(){
        return catalogStatus;
    }
    public void setCatalogName(String catalogName){
        this.catalogName = catalogName;
    }
    public void setDescriptions(String descriptions){
        this.descriptions = descriptions;
    }
    public void setCatalogStatus(boolean catalogStatus){
        this.catalogStatus = catalogStatus;
    }
    public void inputData(Scanner scanner, Categories[] categories, int index){
        if(index != 0){
            int categoryIdMax = categories[0].getCatalogId();
            for (int i = 0; i < index; i++)
                if (categories[i].getCatalogId() > categoryIdMax)   categoryIdMax = categories[i].getCatalogId();
            categories[index].catalogId = categoryIdMax + 1;
        }
        else categories[index].catalogId = 1;

        String tempCategoryName;
        do {
            System.out.println("Please enter category name (less than 50 characters): ");
            tempCategoryName = scanner.nextLine();

        }while (tempCategoryName.length() > 50);
    }
    public void displayData(){
        System.out.println("displayData");
    }
}
