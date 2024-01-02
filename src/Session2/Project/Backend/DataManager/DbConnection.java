package Session2.Project.Backend.DataManager;

import java.sql.Connection;

public interface DbConnection {
    Connection openConnection();
    void closeConnection(Connection connection);
}