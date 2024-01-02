package Session2.Project.Backend.Entity;

import java.util.Date;

public class product implements IEntity {
    private String productId;
    private String productName;
    private String manufacturer;
    private Date createdDate;
    private short batch;
    private int quantity;
    private ProductStatus productStatus;

    public product() {
    }

    public product(String productId, String productName,
                   String manufacturer, Date createdDate, short batch, int quantity, ProductStatus productStatus) {
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
