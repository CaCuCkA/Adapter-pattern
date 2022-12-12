package ua.edu.ucu.apps.adapter.task3;

public record Report(String statistics, String userData) {
    @Override
    public String toString() {
        return "Report{" +
                "statistics='" + statistics + '\'' +
                ", userData='" + userData + '\'' +
                '}';
    }

    public String getStatistics() {
        return statistics;
    }

    public String getUserData() {
        return userData;
    }
}
