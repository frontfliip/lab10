package org.example.adapter1;

import static org.example.adapter1.LoginType.TWITTER;

public class Main {
    public static void main(String[] args) {
        Client client = new Login().login(TWITTER);
        new MessageSender().send("super duper", client, "Ukraine");
    }
}
