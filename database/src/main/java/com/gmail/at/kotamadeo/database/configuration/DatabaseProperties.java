package com.gmail.at.kotamadeo.database.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DatabaseProperties {
    private String url;
    private String driver;
    private String username;
    private String password;
}
