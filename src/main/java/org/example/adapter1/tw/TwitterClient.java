package org.example.adapter1.tw;

import org.example.adapter1.Client;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TwitterClient implements Client {
    private final TwitterUser user;

    public TwitterClient(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry().toString();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return LocalDate.parse(user.getLastActiveTime());
    }
}
