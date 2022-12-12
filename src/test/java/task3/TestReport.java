package task3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.adapter.task3.Authorization;
import ua.edu.ucu.apps.adapter.task3.Database;
import ua.edu.ucu.apps.adapter.task3.Report;
import ua.edu.ucu.apps.adapter.task3.ReportBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestReport {
    private static Database database;

    @BeforeAll
    public static void setUp() {
        database = new Database();
    }

    @Test
    public void testReport() {
        ReportBuilder reportBuilder = new ReportBuilder(database);
        Report report = reportBuilder.buildReport();

        assertEquals(report.getStatistics(), "hello2");
        assertEquals(report.getUserData(), "hello");
    }

    @Test
    public void testAuthorization() {
        Authorization authorization = new Authorization();
        assertTrue(authorization.authorize(database));
    }
}