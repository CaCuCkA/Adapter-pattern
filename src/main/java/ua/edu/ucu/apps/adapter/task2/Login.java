package ua.edu.ucu.apps.adapter.task2;

import java.time.LocalDate;

public class Login {
    public Client login(String loginMethod) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClient(new TwitterUser(
                    "nickolay.yakovkin@gmail.com",
                    Country.UKRAINE,
                    LocalDate.of(2004, 4, 20)
            ));
        }
        if (loginMethod.equals("facebook")) {
            return new FacebookClient(new FacebookUser(
                    "nickolay.yakovkin@gmail.com",
                    Country.UKRAINE,
                    LocalDate.of(2004, 4, 20)
            ));
        }
        throw new IllegalArgumentException("Unsupported login method");
    }
}
