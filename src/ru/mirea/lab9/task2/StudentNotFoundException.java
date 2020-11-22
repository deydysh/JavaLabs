package ru.mirea.lab9.task2;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String message) {
        super(message + " does not exist in the list");
    }
}
