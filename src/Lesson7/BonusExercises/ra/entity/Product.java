package Lesson7.BonusExercises.ra.entity;

import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private float profit;
    private int quantity;
    private String descriptions;
    private boolean status;

    public Product() {
    }

    public Product(String productId, String productName, float importPrice, float exportPrice, float profit, int quantity, String descriptions, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.profit = profit;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void inputData(Scanner scanner, Product[] arrProduct){
        System.out.println("inputMethods data");
    }
    public void displayData(){
        System.out.println("display data");
    }
    public float calProfit(){
        System.out.println("calc profit");
        return  this.profit = this.exportPrice - this.importPrice;
    }
}
