package Session2.Project.Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/Project_Management";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "S0meth!ng976431";

    public static Connection openConnection(){
        Connection connection = null;   // Khai báo biến connection.
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException |SQLException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
    public static void closeConnection(Connection connection){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        // Test db connection.
        Connection conn = ConnectionDb.openConnection();
        if(conn != null){
            System.out.println("Connect database successfullly.");
        }else{
            System.err.println("Error!");
        }
        ConnectionDb.closeConnection(conn);
    }
}
