package ua.edu.ucu.apps.singleton;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.SQLException;

@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String email;
    private int age;

    public void save() throws SQLException {
        Connection connection = Connection.getInstance();
        connection.executeQuery("INSERT INTO user VALUES ('" + name + "', '" + email + "', " + age + ")");
    }
}
