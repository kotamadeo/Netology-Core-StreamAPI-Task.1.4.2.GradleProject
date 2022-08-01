package com.gmail.at.kotamadeo.database.models;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
@Data
public class User {
    private UUID uuid;
    @NonNull
    private long id;
    @NonNull
    private String surname;
    @NonNull
    private String name;
    @NonNull
    private byte age;

    @Override
    public String toString() {
        return String.format("Пользователь: %s %s, %d.%nУникальный идентификатор - %d, uuid - %s.",
                name, surname, age, id, uuid);
    }
}
