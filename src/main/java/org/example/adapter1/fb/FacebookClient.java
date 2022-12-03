package org.example.adapter1.fb;

import org.example.adapter1.Client;

import java.time.LocalDate;

public class FacebookClient implements Client {
    private final FacebookUser user;

    public FacebookClient(FacebookUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry().toString();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return user.getGetUserActiveTime();
    }
}
