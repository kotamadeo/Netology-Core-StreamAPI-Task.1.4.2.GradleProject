package com.gmail.at.kotamadeo.database.configuration;

import com.gmail.at.kotamadeo.database.models.User;
import lombok.Data;

import java.util.UUID;

@Data
public class Connection {
    private DatabaseProperties databaseProperties;
    private User user;
    public static long id;

    public Connection(DatabaseProperties databaseProperties) {
        this.databaseProperties = databaseProperties;
        user = new User(++id, "Фостер", "Джейн", (byte) 32);
        user.setUuid(UUID.randomUUID());
    }
}
