package org.example.singleton;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Ivan", "ivnik.u@gmail.con", 33);
        user.save();
    }
}
