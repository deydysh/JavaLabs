package ru.mirea.lab2;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author (String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String e) {
        email = e;
    }
    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}