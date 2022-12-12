package ua.edu.ucu.apps.adapter.task2;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class TwitterClient implements Client {
    private TwitterUser user;

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return String.valueOf(user.getCountry());
    }

    @Override
    public LocalDate getLastActiveTime() {
        return user.getLastActiveTime();
    }
}
