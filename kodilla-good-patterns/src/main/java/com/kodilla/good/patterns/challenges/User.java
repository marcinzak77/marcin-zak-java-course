package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String surname;
    private String address;

    public User(final String name, final String surname, final String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }
}
