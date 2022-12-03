package org.example.adapter1;


import java.time.LocalDate;

public interface Client {
    String getEmail();
    String getCountry();
    LocalDate getLastActiveTime();
}
