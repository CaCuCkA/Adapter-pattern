package ua.edu.ucu.apps.adapter.task3;

public class Database extends БазаДаних {
    public String getStatistics() {
        return super.отриматиСтатистичніДані();
    }

    public String getUserData() {
        return super.отриматиДаніКористувача();
    }
}
