package task2;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.adapter.task2.Client;
import ua.edu.ucu.apps.adapter.task2.Login;


import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoginTest {
    @Test
    public void testLoginFacebook() {
        Login login = new Login();
        Client user = login.login("facebook");

        assertEquals(user.getEmail(), "nickolay.yakovkin@gmail.com");
        assertEquals(user.getCountry(), "UKRAINE");
        assertEquals(user.getLastActiveTime(), LocalDate.of(2004, 4, 20));
    }

    @Test
    public void testLoginTwitter() {
        Login login = new Login();
        Client user = login.login("twitter");

        assertEquals(user.getEmail(), "nickolay.yakovkin@gmail.com");
        assertEquals(user.getCountry(), "UKRAINE");
        assertEquals(user.getLastActiveTime(), LocalDate.of(2004, 4, 20));
    }

    @Test
    public void testLoginException() {
        Login login = new Login();
        try {
            login.login("youtube");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Unsupported login method");
        }
    }
}