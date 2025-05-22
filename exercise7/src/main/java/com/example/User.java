package com.example;

import javafx.beans.property.SimpleStringProperty;

public class User {
    private final SimpleStringProperty username;
    private final SimpleStringProperty password;
    private final SimpleStringProperty accountcreated;
    private final SimpleStringProperty accountstatus;

    public User(String username, String password) {
        this.username = new SimpleStringProperty(username);
        this.password = new SimpleStringProperty(password);
        this.accountcreated = new SimpleStringProperty(accountcreated);
        this.accountstatus = new SimpleStringProperty(accountstatus);
    }

    public String getUsername() {
        return username.get();
    }

    public String getPassword() {
        return password.get();
    }

    public String getAccountcreated() {
        return accountcreated.get();
    }

    public String getAccountstatus() {
        return accountstatus.get();
    }
}
