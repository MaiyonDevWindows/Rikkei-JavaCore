package Session2.Project.Backend.Business;

import Session2.Project.Backend.DataManager.DataManagerImp;
import Session2.Project.Backend.DataManager.DbConnection;
import Session2.Project.Backend.DataManager.MySqlConnection;
import Session2.Project.Backend.Entity.Account;
import Session2.Project.Backend.Utilities.DataFilePaths;

import java.sql.*;

public class LoginBusiness extends DataManagerImp<Account> {
    public Account login(String userName, String password) {
        Account account = null;
        Connection conn = null;
        DbConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        try {
            callSt = conn.prepareCall("{call getAccountByUNameNPwd(?, ?)}");
            callSt.setString(1, userName);
            callSt.setString(2, password);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                account = new Account();
                account.setAccountId(rs.getInt("acc_id"));
                account.setUserName(rs.getString("user_name"));
                account.setPassword(rs.getString("password"));
                account.setPermission(rs.getBoolean("permission"));
                account.setEmployeeId(rs.getString("emp_id"));
                account.setAccountStatus(rs.getBoolean("acc_status"));
            }
        } catch (SQLException e) {
            System.err.println("Error during query execution.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return account;
    }
    public Account checkExistsSessionUser(){
        Account account = readObjectFromFile(DataFilePaths.getUserSaveFilePath());
        if(account != null) account = login(account.getUserName(), account.getPassword());
        return account;
    }
    public void clearUserSession(){
        writeObjectToFile(DataFilePaths.getUserSaveFilePath(), null);
    }
}