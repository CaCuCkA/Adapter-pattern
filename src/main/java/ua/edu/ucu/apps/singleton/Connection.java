package ua.edu.ucu.apps.singleton;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {
    private static Connection connection;
    private final java.sql.Connection jdbcConnection;

    private Connection() throws SQLException {
        jdbcConnection = DriverManager.getConnection("jdbc:sqlite:users.sqlite");
    }

    public void executeQuery(String query) throws SQLException {
        Statement stmt = jdbcConnection.createStatement();
        stmt.executeUpdate(query);
        stmt.close();
    }

    public static Connection getInstance() throws SQLException {
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }
}
