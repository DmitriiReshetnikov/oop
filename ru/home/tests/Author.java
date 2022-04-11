package ru.home.tests;

public class Author {
    private final String firstName;
    private final String secondName;
    private final String lastName; // отчество

    public Author(String firstName, String lastName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }
}
