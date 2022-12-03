package org.example.adapter2;

import lombok.Getter;

@Getter
public class DataBase {
    private БазаДаних базаДаних = new БазаДаних();

    public String getUserData() {
        return базаДаних.отриматиДаніКористувача();
    }

    public String getStatistics() {
        return базаДаних.отриматиСтатистичніДані();
    }
}
