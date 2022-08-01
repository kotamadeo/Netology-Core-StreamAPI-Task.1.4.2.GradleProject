package com.gmail.at.kotamadeo.services;

import com.gmail.at.kotamadeo.database.configuration.Connection;
import com.gmail.at.kotamadeo.database.configuration.DatabaseProperties;
import com.gmail.at.kotamadeo.database.models.User;
import lombok.Data;

import java.util.UUID;

@Data
public class UserService {
    private final DatabaseProperties databaseProperties =
            new DatabaseProperties("jdbc:postgresql://localhost:5432/netologyMockDB",
                    "org.postgresql.Driver", "postgres", "postgres");
    private String title;
    private final Connection connection = new Connection(databaseProperties);

    public User setUser(User user) {
        user.setUuid(UUID.randomUUID());
        connection.setUser(user);
        return user;
    }
}
