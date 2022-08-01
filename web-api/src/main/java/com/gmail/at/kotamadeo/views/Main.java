package com.gmail.at.kotamadeo.views;

import com.gmail.at.kotamadeo.database.configuration.Connection;
import com.gmail.at.kotamadeo.database.models.User;
import com.gmail.at.kotamadeo.services.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        System.out.println(userService.getConnection().getUser());
        System.out.println();
        System.out.println(userService.setUser(new User(++Connection.id, "Одинсон", "Тор", (byte)35)));
    }
}
