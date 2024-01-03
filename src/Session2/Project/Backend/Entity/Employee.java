package Session2.Project.Backend.Entity;

import Session2.Project.Backend.Business.EmployeeBusiness;
import Session2.Project.Backend.Utilities.CommonHandles;
import Session2.Project.Backend.Utilities.InputHandles;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee implements IEntity {
    private EmployeeBusiness employeeBusiness;
    private String employeeId;
    private String employeeName;
    private Date boD;
    private String email;
    private String phone;
    private String address;
    private short employeeStatus;

    public Employee() {
        employeeBusiness = new EmployeeBusiness();
    }

    public Employee(String employeeId, String employeeName,
                    Date boD, String email, String phone, String address, short employeeStatus) {
        employeeBusiness = new EmployeeBusiness();
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

    public void inputData(Scanner scanner) {
        employeeId = inputEmployeeId(scanner);
        employeeName = inputEmployeeName(scanner);
        boD = inputBoD(scanner);
        email = inputEmail(scanner);
        phone = inputPhone(scanner);
        address = inputAddress(scanner);
        employeeStatus = inputEmployeeStatus(scanner);
    }

    public String inputEmployeeId(Scanner scanner) {
        System.out.print("Please enter employee id: ");
        do {
            String employeeId = InputHandles.inputNormalizeString(scanner);
            if (employeeId.trim().length() != 5) {
                System.err.println("Employee id length must be 5 characters.");
            } else if (employeeBusiness.findById(employeeId) != null) {
                System.err.println("Employee id is exists, please re enter another employee id.");
            } else return employeeId;
        } while (true);
    }

    public String inputEmployeeName(Scanner scanner) {
        System.out.print("Please enter employee name: ");
        do {
            String employeeName = InputHandles.inputNormalizeString(scanner);
            if (employeeName.isEmpty()) {
                System.err.println("Employee must not be empty.");
            } else if (employeeBusiness.findByName(employeeName) != null) {
                System.err.println("Employee name is exists, please re enter another employee name.");
            } else return employeeName;
        } while (true);
    }

    public Date inputBoD(Scanner scanner) {
        System.out.print("Please input date of birth: ");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        do {
            try {
                Date birthOfDate = sdf.parse(scanner.nextLine());
                return birthOfDate;
            } catch (ParseException e) {
                System.err.println("Your input is not valid value, please try again (yyyy-MM-dd).");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);
    }
    public String inputEmail(Scanner scanner) {
        System.out.print("Please enter email: ");
        do {
            String email = InputHandles.inputNormalizeString(scanner);
            if (email.isEmpty()) {
                System.err.println("Email must not be empty.");
            } else return email;
        } while (true);
    }
    public String inputPhone(Scanner scanner) {
        System.out.print("Please enter phone: ");
        do {
            String phone = InputHandles.inputNormalizeString(scanner);
            if (phone.isEmpty()) {
                System.err.println("Phone must not be empty.");
            } else return phone;
        } while (true);
    }
    public String inputAddress(Scanner scanner) {
        System.out.print("Please enter address: ");
        do {
            String address = InputHandles.inputNormalizeString(scanner);
            if (address.isEmpty()) {
                System.err.println("Address must not be empty.");
            } else return address;
        } while (true);
    }
    public short inputEmployeeStatus(Scanner scanner){
        System.out.print("Please enter status value (0 - active | 1 - rest | 2 - quit): ");
        do {
            byte employeeStatus = InputHandles.inputByte(scanner);
            if (employeeStatus >= 0 && employeeStatus <= 2) {
                return employeeStatus;
            } else System.err.println("Your employee status is not valid value, please try again.");
        } while (true);
    }
    public void updateData(Scanner scanner){
        boolean isExit = false;
        int choice;
        do {
            System.out.println("""
                        |===============UPDATE EMPLOYEE DATA===============|");
                        1. Update employee name.
                        2. Update employee bod.
                        3. Update employee email.
                        4. Update employee phone.
                        5. Update employee address.
                        6. Back.
                        """);
            choice = CommonHandles.inputChoice(scanner);
            switch (choice) {
                case 1:
                    employeeName = inputEmployeeName(scanner);
                    break;
                case 2:
                    boD = inputBoD(scanner);
                    break;
                case 3:
                    email = inputEmail(scanner);
                    break;
                case 4:
                    phone = inputPhone(scanner);
                    break;
                case 5:
                    address = inputAddress(scanner);
                case 6:
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
                        |===============UPDATE EMPLOYEE STATUS===============|");
                        1. Active.
                        2. Rest.
                        3. Quit
                        """);
            choice = CommonHandles.inputChoice(scanner);
            switch (choice) {
                case 1:
                    employeeStatus = 0;
                    isExit = true;
                    break;
                case 2:
                    employeeStatus = 1;
                    isExit = true;
                    break;
                case 3:
                    employeeStatus = 2;
                    isExit = true;
                    break;
                default:
                    System.err.println("Nhập lựa chọn từ 1-2!");
            }
        } while (!isExit);
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
