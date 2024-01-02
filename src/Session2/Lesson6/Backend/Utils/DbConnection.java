package Session2.Lesson6.Backend.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/fresher_book_management";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection openConnection(){
        Connection conn = null;
        try {
            // Set Driver.
            Class.forName(DRIVER);
            // Khởi tạo đối tượng Connection từ Driver Manager.
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    public static void closeConnection(Connection conn){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Connection conn = openConnection();
        if(conn != null) System.out.println("Connect successfully.");
        else System.out.println("Connect failure.");
    }
}
