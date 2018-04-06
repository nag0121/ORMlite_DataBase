package com.example.lenovo.ormlite_database;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

public class User {

    @DatabaseField(generatedId = true,columnName = "id")
    public int id;
    @DatabaseField(columnName = "name",canBeNull = false)
    public String name;
    @DatabaseField(columnName = "email",canBeNull = false)
    public String email;

    public User(final String name, final String email) {
        this.name = name;
        this.email = email;
    }

    public User() {

    }
}
