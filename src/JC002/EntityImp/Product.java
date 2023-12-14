package JC002.EntityImp;

import JC002.Entity.IProduct;

import java.util.Scanner;

public class Product implements IProduct {
    private String productId;
    private String productName;
    private double importPrice;
    private double exportPrice;
    private double profit;
    private String description;
    private boolean status;
    private int categoryId;

    public Product() {
    }

    public Product(String productId, String productName, double importPrice, double exportPrice, String description,
                   boolean status, int categoryId) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.description = description;
        this.status = status;
        this.categoryId = categoryId;
    }

    public Product(String productId, String productName, double importPrice, double exportPrice, double profit,
                   String description, boolean status, int categoryId) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.profit = profit;
        this.description = description;
        this.status = status;
        this.categoryId = categoryId;
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

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", profit=" + profit +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", categoryId=" + categoryId +
                '}';
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("input data");
    }

    @Override
    public void displayData() {
        System.out.println(this.toString());
    }

    @Override
    public void calProfit() {
        profit = exportPrice - importPrice;
    }
}