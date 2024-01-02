package Session2.Lesson6.Backend.Business;

import Session2.Lesson6.Backend.Entity.Book;
import Session2.Lesson6.Backend.Utils.DbConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookBusiness implements IBusiness<Book, Integer>{
    @Override
    public List<Book> getAll() {
        Connection conn = null;
        CallableStatement callSt = null;
        conn = DbConnection.openConnection();
        List<Book> bookList = null;
        try {
            conn.setAutoCommit(true); // false để khi có exception thì rollback lại (dùng khi có thay đổi dl).
            callSt = conn.prepareCall("{call get_all_book()}");
            ResultSet rs = callSt.executeQuery();
            bookList = new ArrayList<>();
            while (rs.next()) {
                Book book = new Book();
                book.setBookId(rs.getInt("id"));
                book.setBookName(rs.getString("name"));
                book.setPrice(rs.getFloat("price"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setStatus(rs.getBoolean("book_status"));
                bookList.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbConnection.closeConnection(conn);
        }
        return bookList;
    }

    @Override
    public boolean create(Book book) {
        Connection conn = DbConnection.openConnection();
        CallableStatement callSt = null;
        boolean result = false;
        try{
            conn.setAutoCommit(false);
            // Set gi trị cho các tham số vào.
            callSt = conn.prepareCall("{call create_book(?, ?, ?, ?, ?)}");
            callSt.setString(1, book.getBookName());
            callSt.setFloat(2, book.getPrice());
            callSt.setString(3, book.getTitle());
            callSt.setString(4, book.getAuthor());
            callSt.setBoolean(5, book.isStatus());
            // Đăng ký kiểu dữ liệu cho các tham số ra.
            // Thực hiện gọi procedure.
            callSt.executeUpdate();
            conn.commit();
            result = true;
        }catch (SQLException e){
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException ex) {
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException ex) {
                e.printStackTrace();
            }
        }finally {
            DbConnection.closeConnection(conn);
        }
        return result;
    }

    @Override
    public boolean update(Book book) {
        Connection conn = DbConnection.openConnection();
        CallableStatement callSt1 = null;
        CallableStatement callSt2 = null;
        boolean result = false;
        try{
            conn.setAutoCommit(false);
            // Kiểm tra bookId có tồn tại hay không.
            callSt1 = conn.prepareCall("{call get_book_by_id(?, ?)}");
            callSt1.setInt(1, book.getBookId());
            // Đăng ký tham số trả ra
            callSt1.registerOutParameter(2, Types.INTEGER);
            callSt1.execute();
            // Lấy giá trị tham số trả ra.
            int countBook = callSt1.getInt(2);
            if(countBook > 0){
                // Set gi trị cho các tham số vào.
                callSt2 = conn.prepareCall("{call update_book(?, ?, ?, ?, ?, ?)}");
                callSt2.setInt(1, book.getBookId());
                callSt2.setString(2, book.getBookName());
                callSt2.setFloat(3, book.getPrice());
                callSt2.setString(4, book.getTitle());
                callSt2.setString(5, book.getAuthor());
                callSt2.setBoolean(6, book.isStatus());
                // Đăng ký kiểu dữ liệu cho các tham số ra.
                // Thực hiện gọi procedure.
                callSt2.executeUpdate();
            }
            conn.commit();
            result = true;
        }catch (SQLException e){
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException ex) {
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException ex) {
                e.printStackTrace();
            }
        }finally {
            DbConnection.closeConnection(conn);
        }
        return result;
    }

    @Override
    public boolean delete(Integer bookId) {
        Connection conn = DbConnection.openConnection();
        CallableStatement callSt1 = null;
        CallableStatement callSt2 = null;
        boolean result = false;
        try{
            conn.setAutoCommit(false);
            // Kiểm tra bookId có tồn tại hay không.
            callSt1 = conn.prepareCall("{call get_book_by_id(?, ?)}");
            callSt1.setInt(1, bookId);
            // Đăng ký tham số trả ra
            callSt1.registerOutParameter(2, Types.INTEGER);
            callSt1.execute();
            // Lấy giá trị tham số trả ra.
            int countBook = callSt1.getInt(2);
            if(countBook > 0){
                // Set gi trị cho các tham số vào.
                callSt2 = conn.prepareCall("{call delete_book(?)}");
                callSt2.setInt(1, bookId);
                // Đăng ký kiểu dữ liệu cho các tham số ra.
                // Thực hiện gọi procedure.
                callSt2.executeUpdate();
            }
            conn.commit();
            result = true;
        }catch (SQLException e){
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException ex) {
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException ex) {
                e.printStackTrace();
            }
        }finally {
            DbConnection.closeConnection(conn);
        }
        return result;
    }

    @Override
    public Book findById(Integer integer) {
        return null;
    }
}
