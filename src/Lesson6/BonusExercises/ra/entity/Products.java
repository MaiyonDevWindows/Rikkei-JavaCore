package Lesson6.BonusExercises.ra.entity;

import java.util.Date;
import java.util.Scanner;

public class Products {
    private int productId;
    private String productName;
    private float price;
    private String descriptions;
    private Date created;
    private int catalogId;
    private int productStatus;

    public Products() {

    }

    public Products(int productId, String productName, float price, String descriptions, Date created,
                    int catalogId, int productStatus){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.descriptions = descriptions;
        this.created = created;
        this.catalogId = catalogId;
        this.productId = productId;
    }
    public int getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public float getPrice(){
        return price;
    }
    public String getDescriptions(){
        return descriptions;
    }
    public Date getCreated(){
        return created;
    }
    public int getCatalogId(){
        return catalogId;
    }
    public int getProductStatus(){
        return productStatus;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public void setDescriptions(String descriptions){
        this.descriptions = descriptions;
    }
    public void setCreated(Date created){
        this.created = created;
    }
    public void setCatalogId(int catalogId){
        this.catalogId = catalogId;
    }
    public void setProductStatus(int productStatus){
        this.productStatus = productStatus;
    }
    public void inputData(Scanner scanner, Products[] products, int index){
        System.out.println("inputData");
    }
    public void displayData(){
        System.out.println("displayData");
    }
}
