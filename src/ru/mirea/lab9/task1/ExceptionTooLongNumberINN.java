package ru.mirea.lab9.task1;

public class ExceptionTooLongNumberINN extends ExceptionNumberINN {
    public ExceptionTooLongNumberINN(String message) {
        super(message + " is too long");
    }
}
