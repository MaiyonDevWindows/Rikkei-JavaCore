package Session2.Project.Backend.Business;

import Session2.Project.Backend.DataManager.DbConnection;
import Session2.Project.Backend.DataManager.MySqlConnection;
import Session2.Project.Backend.Entity.Product;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductBusiness implements IBusiness<Product, String, String, Integer> {

    public List<Product> getAll(Integer pageNumber) {
        Connection conn = null;
        MySqlConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        List<Product> productList = null;
        try {
            callSt = conn.prepareCall("{call getProductByPage(?)}");
            callSt.setInt(1, pageNumber);
            ResultSet rs = callSt.executeQuery();
            productList = new ArrayList<>();
            while (rs.next()) {
                Product product = new Product();
                product.setProductId(rs.getString("product_id"));
                product.setProductName(rs.getString("product_name"));
                product.setManufacturer(rs.getString("manufacturer"));
                product.setCreatedDate(rs.getDate("created"));
                product.setBatch(rs.getShort("batch"));
                product.setQuantity(rs.getInt("quantity"));
                product.setProductStatus
                        (rs.getBoolean("product_status") ? Product.ProductStatus.ACTIVE : Product.ProductStatus.INACTIVE);
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            mySqlConn.closeConnection(conn);
        }
        return productList;
    }

    @Override
    public boolean create(Product product) {
        Connection conn = null;
        MySqlConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn.setAutoCommit(false);
            callSt = conn.prepareCall("{call addNewProduct(?, ?, ?, null, ?, null, ?)}");
            callSt.setString(1, product.getProductId());
            callSt.setString(2, product.getProductName());
            callSt.setString(3, product.getManufacturer());
            callSt.setInt(4, product.getBatch());
            callSt.setBoolean(5, product.isProductStatus().getStatus());
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
    public boolean update(Product product) {
        Connection conn = null;
        MySqlConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn.setAutoCommit(false);
            callSt = conn.prepareCall("{call updateProductById(?,?,?,?,?)}");
            callSt.setString(1, product.getProductId());
            callSt.setString(2, product.getProductName());
            callSt.setString(3, product.getManufacturer());
            callSt.setInt(4, product.getBatch());
            callSt.setBoolean(5, product.isProductStatus().getStatus());
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
    public boolean delete(Product product, String s) {
        return false;
    }

    @Override
    public Product findById(String productId) {
        Connection conn = null;
        MySqlConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        Product product = null;
        try {
            callSt = conn.prepareCall("{call getProductById(?)}");
            callSt.setString(1, productId);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                product = new Product();
                product.setProductId(rs.getString("product_id"));
                product.setProductName(rs.getString("product_name"));
                product.setManufacturer(rs.getString("manufacturer"));
                product.setCreatedDate(rs.getDate("created"));
                product.setBatch(rs.getShort("batch"));
                product.setQuantity(rs.getInt("quantity"));
                product.setProductStatus
                        (rs.getBoolean("product_status") ? Product.ProductStatus.ACTIVE : Product.ProductStatus.INACTIVE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            mySqlConn.closeConnection(conn);
        }
        return product;
    }

    @Override
    public Product findByName(String productName) {
        Connection conn = null;
        MySqlConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        Product product = null;
        try {
            callSt = conn.prepareCall("{call getProductByName(?)}");
            callSt.setString(1, productName);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                product = new Product();
                product.setProductId(rs.getString("product_id"));
                product.setProductName(rs.getString("product_name"));
                product.setManufacturer(rs.getString("manufacturer"));
                product.setCreatedDate(rs.getDate("created"));
                product.setBatch(rs.getShort("batch"));
                product.setQuantity(rs.getInt("quantity"));
                product.setProductStatus
                        (rs.getBoolean("product_status") ? Product.ProductStatus.ACTIVE : Product.ProductStatus.INACTIVE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            mySqlConn.closeConnection(conn);
        }
        return product;
    }

    @Override
    public List<Product> search(String productName, Integer pageNumber) {
        Connection conn = null;
        MySqlConnection mySqlConn = new MySqlConnection();
        conn = mySqlConn.openConnection();
        CallableStatement callSt = null;
        List<Product> productList = null;
        try {
            callSt = conn.prepareCall("{call searchForProductNameByPage(?, ?)}");
            callSt.setString(1, productName);
            callSt.setInt(2, pageNumber);
            ResultSet rs = callSt.executeQuery();
            productList = new ArrayList<>();
            while (rs.next()) {
                Product product = new Product();
                product.setProductId(rs.getString("product_id"));
                product.setProductName(rs.getString("product_name"));
                product.setManufacturer(rs.getString("manufacturer"));
                product.setCreatedDate(rs.getDate("created"));
                product.setBatch(rs.getShort("batch"));
                product.setQuantity(rs.getInt("quantity"));
                product.setProductStatus
                        (rs.getBoolean("product_status") ? Product.ProductStatus.ACTIVE : Product.ProductStatus.INACTIVE);
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            mySqlConn.closeConnection(conn);
        }
        return productList;
    }
}
