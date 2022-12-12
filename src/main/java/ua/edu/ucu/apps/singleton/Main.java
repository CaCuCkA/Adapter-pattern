package ua.edu.ucu.apps.singleton;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user = new User(
                "Mykola",
                "mykola.yakovkin@ucu.edu.ua",
                18
        );
        user.save();
    }
}
