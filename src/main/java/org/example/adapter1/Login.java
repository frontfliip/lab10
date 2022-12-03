package org.example.adapter1;

import org.example.adapter1.fb.Country;
import org.example.adapter1.fb.FacebookClient;
import org.example.adapter1.fb.FacebookUser;
import org.example.adapter1.tw.TwitterClient;
import org.example.adapter1.tw.TwitterUser;

import java.time.LocalDate;

public class Login {

    public Client login(LoginType loginMethod) {
        return switch (loginMethod) {
            case TWITTER -> new TwitterClient(new TwitterUser("ivan@gmail.com", "Ukraine", "2022-11-21"));
            case FACEBOOK ->
                    new FacebookClient(new FacebookUser("ivan@gmail.com", Country.Ukraine, LocalDate.now()));
            default -> throw new IllegalArgumentException("No such loginMethod");
        };
    }

}
