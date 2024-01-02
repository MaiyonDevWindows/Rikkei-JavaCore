package Session2.Project.Backend.Entity;

import java.util.Date;

public class Bill implements IEntity {
    private long billId;
    private String billCode;
    private boolean billType;
    private String employeeIdCreated;
    private Date createdDate;
    private String employeeIdAuth;
    private Date authDate;
    private BillStatus billStatus;
    public Bill() {
    }

    public Bill(long billId, String billCode, boolean billType,
                String employeeIdCreated, Date createdDate,
                String employeeIdAuth, Date authDate, BillStatus billStatus) {
        this.billId = billId;
        this.billCode = billCode;
        this.billType = billType;
        this.employeeIdCreated = employeeIdCreated;
        this.createdDate = createdDate;
        this.employeeIdAuth = employeeIdAuth;
        this.authDate = authDate;
        this.billStatus = billStatus;
    }

    public long getBillId() {
        return billId;
    }

    public void setBillId(long billId) {
        this.billId = billId;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public boolean isBillType() {
        return billType;
    }

    public void setBillType(boolean billType) {
        this.billType = billType;
    }

    public String getEmployeeIdCreated() {
        return employeeIdCreated;
    }

    public void setEmployeeIdCreated(String employeeIdCreated) {
        this.employeeIdCreated = employeeIdCreated;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getEmployeeIdAuth() {
        return employeeIdAuth;
    }

    public void setEmployeeIdAuth(String employeeIdAuth) {
        this.employeeIdAuth = employeeIdAuth;
    }

    public Date getAuthDate() {
        return authDate;
    }

    public void setAuthDate(Date authDate) {
        this.authDate = authDate;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billId=" + billId +
                ", billCode='" + billCode + '\'' +
                ", billType=" + billType +
                ", employeeIdCreated='" + employeeIdCreated + '\'' +
                ", createdDate=" + createdDate +
                ", employeeIdAuth='" + employeeIdAuth + '\'' +
                ", authDate=" + authDate +
                ", billStatus=" + billStatus +
                '}';
    }

    public enum BillStatus {
        CREATED((byte) 0),
        CANCELLED((byte) 1),
        APPROVED((byte) 2);
        private byte status;

        BillStatus() {
            this.status = 0;
        }

        BillStatus(byte status) {
            this.status = status;
        }

        public byte getStatus() {
            return this.status;
        }

        public void setStatus(byte status) {
            this.status = status;
        }
    }
}