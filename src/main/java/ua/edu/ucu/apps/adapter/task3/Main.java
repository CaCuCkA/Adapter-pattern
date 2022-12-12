package ua.edu.ucu.apps.adapter.task3;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Authorization authorization = new Authorization();

        if (authorization.authorize(database)) {
            ReportBuilder reportBuilder = new ReportBuilder(database);
            Report report = reportBuilder.buildReport();

            System.out.println(report);
        }
    }
}