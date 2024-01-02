package Session2.Project.Backend.Entity;

import java.util.Date;

public class Employee implements IEntity {
    private String employeeId;
    private String employeeName;
    private Date boD;
    private String email;
    private String phone;
    private String address;
    private short employeeStatus;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName,
                    Date boD, String email, String phone, String address, short employeeStatus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.boD = boD;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.employeeStatus = employeeStatus;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getBoD() {
        return boD;
    }

    public void setBoD(Date boD) {
        this.boD = boD;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public short getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(short employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", boD=" + boD +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", employeeStatus=" + employeeStatus +
                '}';
    }
    public enum EmployeeStatus {
        ACTIVE((byte) 0),
        REST((byte) 1),
        QUIT((byte) 2);
        private byte status;

        EmployeeStatus() {
        }

        EmployeeStatus(byte status) {
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
