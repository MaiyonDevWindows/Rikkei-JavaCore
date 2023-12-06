package Lesson6.BonusExercises.ra.entity;

import java.util.Scanner;

public class Categories {
    private int catalogId;
    private String catalogName;
    private String descriptions;
    private boolean catalogStatus;

    public Categories() {

    }

    public Categories(int catalogId, String catalogName, String descriptions, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public boolean getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    public void inputData(Scanner scanner, Categories[] categories, int quantity) {
        if (quantity != 0) {
            int categoryIdMax = categories[0].getCatalogId();
            for (int i = 1; i < quantity; i++)  // Vì phần tử đầu tiên đã lấy phía trên.
                if (categories[i].getCatalogId() > categoryIdMax) categoryIdMax = categories[i].getCatalogId();
            this.catalogId = categoryIdMax + 1;
        } else this.catalogId = 1;

        do {
            System.out.println("Please enter category name (less than 50 characters): ");
            this.catalogName = scanner.nextLine();
        } while (this.getCatalogName().length() > 50);


    }

    public int generateCategoryId(Scanner scanner, Categories[] categories, int catergoryIndex) {
        if (catergoryIndex == 0) return 1;
        else {
            int maxId = categories[0].getCatalogId();
            for (int i = 1; i < catergoryIndex; i++)
                if (categories[i].getCatalogId() > maxId) maxId = categories[i].getCatalogId();
            return maxId;
        }
    }

    public void displayData() {
        System.out.println("displayData");
    }
}
