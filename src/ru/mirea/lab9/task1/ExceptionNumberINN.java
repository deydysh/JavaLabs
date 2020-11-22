package ru.mirea.lab9.task1;

public class ExceptionNumberINN extends  Exception{
    public ExceptionNumberINN(String message) {
        super("INN: " + message);
    }
}
