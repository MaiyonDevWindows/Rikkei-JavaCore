package Session2.Project.Backend.Entity;

import Session2.Project.Backend.Business.ProductBusiness;
import Session2.Project.Backend.Utilities.CommonHandles;
import Session2.Project.Backend.Utilities.InputHandles;

import java.util.Date;
import java.util.Scanner;

public class Product implements IEntity {
    private ProductBusiness productBusiness;
    private String productId;
    private String productName;
    private String manufacturer;
    private Date createdDate;
    private short batch;
    private int quantity;
    private ProductStatus productStatus;

    public Product() {
        productBusiness = new ProductBusiness();
    }

    public Product(String productId, String productName,
                   String manufacturer, Date createdDate, short batch, int quantity, ProductStatus productStatus) {
        productBusiness = new ProductBusiness();

        this.productId = productId;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.createdDate = createdDate;
        this.batch = batch;
        this.quantity = quantity;
        this.productStatus = productStatus;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public short getBatch() {
        return batch;
    }

    public void setBatch(short batch) {
        this.batch = batch;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductStatus isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(ProductStatus productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public String toString() {
        return "product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", createdDate=" + createdDate +
                ", batch=" + batch +
                ", quantity=" + quantity +
                ", productStatus=" + productStatus +
                '}';
    }
    public void inputData(Scanner scanner) {
        this.productId = inputProductId(scanner);
        this.productName = inputProductName(scanner);
        this.manufacturer = inputManufacturer(scanner);
        this.batch = inputBatch(scanner);
        this.productStatus = inputProductStatus(scanner) ? ProductStatus.ACTIVE : ProductStatus.INACTIVE;
    }
    public void updateData(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.println("""
                        |===============UPDATE PRODUCT DATA===============|");
                        1. Update product name.
                        2. Update manufacturer name.
                        3. Update batch.
                        4. Back.
                        """);
            choice = CommonHandles.inputChoice(scanner);
            switch (choice) {
                case 1:
                    this.productName = inputProductName(scanner);
                    break;
                case 2:
                    this.manufacturer = inputManufacturer(scanner);
                    break;
                case 3:
                    this.batch = inputBatch(scanner);
                    break;
                case 4:
                    isExit = true;
                    break;
                default:
                    System.err.println("Your choice is not valid value, please try again.");
            }
        } while (!isExit);
    }
    public void updateStatus(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.print("""
                        |===============UPDATE PRODUCT STATUS===============|");
                        1. Active.
                        2. Inactive.
                        """);
            choice = CommonHandles.inputChoice(scanner);
            switch (choice) {
                case 1:
                    productStatus = ProductStatus.ACTIVE;
                    isExit = true;
                    break;
                case 2:
                    productStatus = ProductStatus.INACTIVE;
                    isExit = true;
                    break;
                default:
                    System.err.println("Nhập lựa chọn từ 1-2!");
            }
        } while (!isExit);
    }
    public String inputProductId(Scanner scanner) {
        System.out.print("Please enter product id: ");
        do {
            String productId = InputHandles.inputNormalizeString(scanner);
            if (productId.trim().length() != 5) {
                System.err.println("Product id length must be 5 characters.");
            } else if (productBusiness.findById(productId) != null) {
                System.err.println("Product id is exists, please re enter another product id.");
            } else return productId;
        } while (true);
    }
    public String inputProductName(Scanner scanner) {
        System.out.print("Please enter product name: ");
        do {
            String productName = InputHandles.inputNormalizeString(scanner);
            if (productName.isEmpty()) {
                System.err.println("Product must not be empty.");
            } else if (productBusiness.findByName(productName) != null) {
                System.err.println("Product name is exists, please re enter another product name.");
            } else return productName;
        } while (true);
    }
    public String inputManufacturer(Scanner scanner) {
        System.out.print("Please enter manufacturer name: ");
        do {
            String manufacturerName = InputHandles.inputNormalizeString(scanner);
            if (manufacturerName.isEmpty()) {
                System.err.println("Manufacturer name must not be empty.");
            } else return manufacturerName;
        } while (true);
    }
    public short inputBatch(Scanner scanner) {
        System.out.print("Please enter batch containing the product: ");
        return InputHandles.inputShortInteger(scanner);
    }
    public boolean inputProductStatus(Scanner scanner) {
        System.out.println("Please enter product status (true/false): ");
        return InputHandles.inputBoolean(scanner);
    }
    public enum ProductStatus {
        ACTIVE((boolean) true),
        INACTIVE((boolean) false);
        private boolean status;

        ProductStatus() {
            this.status = true;
        }

        ProductStatus(boolean status) {
            this.status = status;
        }

        public boolean getStatus() {
            return this.status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }
    }
}
