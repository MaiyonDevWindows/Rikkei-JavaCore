package Session2.Project.Backend.Business;

import Session2.Project.Backend.DataManager.MySqlConnection;
import Session2.Project.Backend.Entity.Employee;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeBusiness implements IBusiness<Employee, String, String, Integer> {
    @Override
    public List<Employee> getAll(Integer pageNumber) {
        Connection conn = null;
        MySqlConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        List<Employee> employeeList = null;
        try {
            callSt = conn.prepareCall("{call getEmployeeByPage(?)}");
            callSt.setInt(1, pageNumber);
            ResultSet rs = callSt.executeQuery();
            employeeList = new ArrayList<>();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setEmployeeId(rs.getString("emp_id"));
                employee.setEmployeeName(rs.getString("emp_name"));
                employee.setBoD(rs.getDate("birth_of_day"));
                employee.setEmail(rs.getString("email"));
                employee.setPhone(rs.getString("phone"));
                employee.setAddress(rs.getString("address"));
                employee.setEmployeeStatus(rs.getByte("emp_status"));
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            mySqlConn.closeConnection(conn);
        }
        return employeeList;
    }

    @Override
    public boolean create(Employee employee) {
        Connection conn = null;
        MySqlConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn.setAutoCommit(false);
            callSt = conn.prepareCall("{call addNewEmployee(?, ?, ?, ?, ?, ?, ?)}");
            callSt.setString(1, employee.getEmployeeId());
            callSt.setString(2, employee.getEmployeeName());
            callSt.setDate(3, new java.sql.Date(employee.getBoD().getTime()));
            callSt.setString(4, employee.getEmail());
            callSt.setString(5, employee.getPhone());
            callSt.setString(6, employee.getAddress());
            callSt.setShort(7, employee.getEmployeeStatus());
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
    public boolean update(Employee employee) {
        Connection conn = null;
        MySqlConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn.setAutoCommit(false);
            callSt = conn.prepareCall("{call updateEmployeeById(?,?,?,?,?,?,?)}");
            callSt.setString(1, employee.getEmployeeId());
            callSt.setString(2, employee.getEmployeeName());
            callSt.setDate(3, new java.sql.Date(employee.getBoD().getTime()));
            callSt.setString(4, employee.getEmail());
            callSt.setString(5, employee.getPhone());
            callSt.setString(6, employee.getAddress());
            callSt.setShort(7, employee.getEmployeeStatus());
            callSt.executeUpdate();
            conn.commit();
            result = true;
        } catch (
                Exception ex) {
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
    public boolean delete(Employee employee, String s) {
        return false;
    }

    @Override
    public Employee findById(String employeeId) {
        Connection conn = null;
        MySqlConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        Employee employee = null;
        try {
            callSt = conn.prepareCall("{call getEmployeeById(?)}");
            callSt.setString(1, employeeId);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                employee = new Employee();
                employee.setEmployeeId(rs.getString("emp_id"));
                employee.setEmployeeName(rs.getString("emp_name"));
                employee.setBoD(rs.getDate("birth_of_day"));
                employee.setEmail(rs.getString("email"));
                employee.setPhone(rs.getString("phone"));
                employee.setAddress(rs.getString("address"));
                employee.setEmployeeStatus(rs.getByte("emp_status"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            mySqlConn.closeConnection(conn);
        }
        return employee;
    }

    @Override
    public Employee findByName(String employeeName) {
        Connection conn = null;
        MySqlConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        Employee employee = null;
        try {
            callSt = conn.prepareCall("{call getEmployeeByName(?)}");
            callSt.setString(1, employeeName);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                employee = new Employee();
                employee.setEmployeeId(rs.getString("emp_id"));
                employee.setEmployeeName(rs.getString("emp_name"));
                employee.setBoD(rs.getDate("birth_of_day"));
                employee.setEmail(rs.getString("email"));
                employee.setPhone(rs.getString("phone"));
                employee.setAddress(rs.getString("address"));
                employee.setEmployeeStatus(rs.getByte("emp_status"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            mySqlConn.closeConnection(conn);
        }
        return employee;
    }

    @Override
    public List<Employee> search(String employeeName, Integer pageNumber) {
        Connection conn = null;
        MySqlConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        List<Employee> employeeList = null;
        try {
            callSt = conn.prepareCall("{call searchForEmployeeNameByPage(?, ?)}");
            callSt.setString(1, employeeName);
            callSt.setInt(2, pageNumber);
            ResultSet rs = callSt.executeQuery();
            employeeList = new ArrayList<>();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setEmployeeId(rs.getString("emp_id"));
                employee.setEmployeeName(rs.getString("emp_name"));
                employee.setBoD(rs.getDate("birth_of_day"));
                employee.setEmail(rs.getString("email"));
                employee.setPhone(rs.getString("phone"));
                employee.setAddress(rs.getString("address"));
                employee.setEmployeeStatus(rs.getByte("emp_status"));
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            mySqlConn.closeConnection(conn);
        }
        return employeeList;
    }
}
