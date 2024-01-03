package Session2.Project.Backend.Entity;

import Session2.Project.Backend.Business.AccountBusiness;
import Session2.Project.Backend.Utilities.InputHandles;

import java.io.Serializable;
import java.util.Scanner;

public class Account implements IEntity, Serializable {
    private int accountId;
    private String userName;
    private String password;
    private boolean permission;
    private String employeeId;
    private boolean accountStatus;

    public Account() {
    }

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Account(int accountId, String userName, String password,
                   Permission permission, String employeeId, AccountStatus accountStatus) {
        this.accountId = accountId;
        this.userName = userName;
        this.password = password;
        this.permission = permission.getPermission();
        this.employeeId = employeeId;
        this.accountStatus = accountStatus.getStatus();
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPermission() {
        return permission;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public boolean isAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }
    public boolean isActive(){
        return accountStatus == AccountStatus.ACTIVE.getStatus();
    }
    public boolean isAdmin(){
        return permission == Permission.ADMIN.getPermission();
    }
    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", permission=" + permission +
                ", employeeId='" + employeeId + '\'' +
                ", accountStatus=" + accountStatus +
                '}';
    }
    public void inputData(Scanner scanner) {
        userName = inputUserName(scanner);
        password = inputPassword(scanner);
        permission = inputPermission(scanner);
        employeeId = inputEmployeeId(scanner);
        accountStatus = inputAccStatus(scanner);
    }
    public String inputUserName(Scanner scanner) {
        AccountBusiness accountBusiness = new AccountBusiness();
        System.out.print("Please enter user name: ");
        do {
            String username = InputHandles.inputNormalizeString(scanner);
            if (username.isEmpty()) {
                System.err.println("Product must not be empty.");
            } else if (accountBusiness.findByName(username) != null) {
                System.err.println("Product name is exists, please re enter another product name.");
            } else return username;
        } while (true);
    }
    public String inputPassword(Scanner scanner) {
        System.out.print("Please enter password: ");
        do {
            String password = InputHandles.inputNormalizeString(scanner);
            if (password.isEmpty()) {
                System.err.println("Password must not be empty.");
            } else return password;
        } while (true);
    }
    public boolean inputPermission(Scanner scanner){
        System.out.print("Please enter permission for account (true: user/false: admin): ");
        return InputHandles.inputBoolean(scanner);
    }
    public String inputEmployeeId(Scanner scanner) {
        AccountBusiness accountBusiness = new AccountBusiness();
        System.out.print("Please enter employee id: ");
//        do {
//            String employeeId = InputHandles.inputNormalizeString(scanner);
//            if (employeeId.trim().length() != 5) {
//                System.err.println("Employee id length must be 5 characters.");
//            } else if (accountBusiness.searchAccountByEmployeeId(employeeId).isEmpty()) {
//                System.err.println("Employee id is used, please re enter another employee id.");
//            } else return employeeId;
//        } while (true);
        return "";
    }
    public boolean inputAccStatus(Scanner scanner){
        System.out.print("Please enter account (true: active/false: locked): ");
        return InputHandles.inputBoolean(scanner);
    }
    public enum Permission {
        ADMIN((boolean) false),
        USER((boolean) true);
        private boolean permission;

        Permission() {
            this.permission = true;
        }

        Permission(boolean permission) {
            this.permission = permission;
        }

        public boolean getPermission() {
            return this.permission;
        }

        public void setPermission(boolean permission) {
            this.permission = permission;
        }
    }

    public enum AccountStatus {
        ACTIVE((boolean) true),
        BLOCK((boolean) false);
        private boolean status;

        AccountStatus() {
            this.status = true;
        }

        AccountStatus(boolean status) {
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
