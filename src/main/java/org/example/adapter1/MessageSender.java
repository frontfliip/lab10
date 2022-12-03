package org.example.adapter1;

import java.time.LocalDate;

public class MessageSender {

    public void send(String text, Client user, String country) {
        if (user.getCountry().equals(country)
                && user.getLastActiveTime().isAfter(LocalDate.now().minusDays(1))) {
            System.out.println(("Sending messgae '" + text + "' to user " + user.getEmail()));
        }
    }

}
