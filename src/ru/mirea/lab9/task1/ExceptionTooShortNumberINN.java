package ru.mirea.lab9.task1;

public class ExceptionTooShortNumberINN extends ExceptionNumberINN {
    public ExceptionTooShortNumberINN(String message) {
        super(message + " is too short");
    }
}
