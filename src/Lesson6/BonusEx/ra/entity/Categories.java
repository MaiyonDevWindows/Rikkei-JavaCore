package Lesson6.BonusEx.ra.entity;

import java.util.Objects;
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
        if(index == 0)
            categories[index].catalogId = 1;
        else
            categories[index].catalogId = categories[index - 1].getCatalogId() + 1;

    }
    public void displayData(){
        System.out.println("displayData");
    }
}
