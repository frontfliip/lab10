package org.example.adapter1.fb;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;


@Getter
@AllArgsConstructor
public class FacebookUser {
    private String email;
    private Country userCountry;
    private LocalDate getUserActiveTime;
}
