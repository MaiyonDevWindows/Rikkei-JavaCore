package Session2.Project.Backend.Business;

import Session2.Project.Backend.DataManager.DataManagerImp;
import Session2.Project.Backend.DataManager.MySqlConnection;
import Session2.Project.Backend.Entity.Account;

import java.io.File;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountBusiness implements IBusiness<Account, Integer, String, Integer>{

    @Override
    public List<Account> getAll(Integer pageNumber) {
        Connection conn = null;
        MySqlConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        List<Account> accountList = null;
        try {
            callSt = conn.prepareCall("{call getAccountByPage(?)}");
            callSt.setInt(1, pageNumber);
            ResultSet rs = callSt.executeQuery();
            accountList = new ArrayList<>();
            while (rs.next()) {
                Account account = new Account();
                account.setAccountId(rs.getInt("acc_id"));
                account.setUserName(rs.getString("user_name"));
                account.setPassword(rs.getString("password"));
                account.setPermission(rs.getBoolean("permission"));
                account.setEmployeeId(rs.getString("emp_id"));
                account.setAccountStatus(rs.getBoolean("acc_status"));
                accountList.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            mySqlConn.closeConnection(conn);
        }
        return accountList;
    }

    @Override
    public boolean create(Account account) {
        Connection conn = null;
        MySqlConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn.setAutoCommit(false);
            callSt = conn.prepareCall("{call addNewAccount(?, ?, ?, ?, ?)}");
            callSt.setString(1, account.getUserName());
            callSt.setString(2, account.getPassword());
            callSt.setBoolean(3, account.isPermission());
            callSt.setString(4, account.getEmployeeId());
            callSt.setBoolean(5, account.isAccountStatus());
            callSt.executeUpdate();
            conn.commit();
            result = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } finally {
            mySqlConn.closeConnection(conn);
        }
        return result;
    }

    @Override
    public boolean update(Account account) {
        return false;
    }

    @Override
    public boolean delete(Account account, Integer integer) {
        return false;
    }

    @Override
    public Account findById(Integer integer) {
        return null;
    }
    public List<Account> searchAccountByEmployeeId(String employeeId) {
        Connection conn = null;
        MySqlConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        List<Account> accountList = null;
        try {
            callSt = conn.prepareCall("{call searchAccountByEmployeeId(?)}");
            callSt.setString(1, employeeId);
            ResultSet rs = callSt.executeQuery();
            accountList = new ArrayList<>();
            while (rs.next()) {
                Account account = new Account();
                account.setAccountId(rs.getInt("acc_id"));
                account.setUserName(rs.getString("user_name"));
                account.setPassword(rs.getString("password"));
                account.setPermission(rs.getBoolean("permission"));
                account.setEmployeeId(rs.getString("emp_id"));
                account.setAccountStatus(rs.getBoolean("acc_status"));
                accountList.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            mySqlConn.closeConnection(conn);
        }
        return accountList;
    }

    @Override
    public Account findByName(String username) {
        Connection conn = null;
        MySqlConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        Account account = null;
        try {
            callSt = conn.prepareCall("{call getAccountByUName(?)}");
            callSt.setString(1, username);
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
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            mySqlConn.closeConnection(conn);
        }
        return account;
    }

    @Override
    public List<Account> search(String userName, Integer pageNumber) {
        Connection conn = null;
        MySqlConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        List<Account> accountList = null;
        try {
            callSt = conn.prepareCall("{call searchForAccountByPage(?, ?)}");
            callSt.setString(1, userName);
            callSt.setInt(2, pageNumber);
            ResultSet rs = callSt.executeQuery();
            accountList = new ArrayList<>();
            while (rs.next()) {
                Account account = new Account();
                account.setAccountId(rs.getInt("acc_id"));
                account.setUserName(rs.getString("user_name"));
                account.setPassword(rs.getString("password"));
                account.setPermission(rs.getBoolean("permission"));
                account.setEmployeeId(rs.getString("emp_id"));
                account.setAccountStatus(rs.getBoolean("acc_status"));
                accountList.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            mySqlConn.closeConnection(conn);
        }
        return accountList;
    }
}
