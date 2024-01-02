package Session2.Project.Backend.Entity;

import java.io.Serializable;

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

    // Input.

    // Check.
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
