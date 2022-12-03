package org.example.adapter2;

public class Auth {

    private Авторизація auth = new Авторизація();
    public boolean auth(DataBase db) {
        return auth.авторизуватися(db.getБазаДаних());
    }
}
