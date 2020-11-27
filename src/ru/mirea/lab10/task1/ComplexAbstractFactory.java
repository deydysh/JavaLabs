package ru.mirea.lab10.task1;

import ru.mirea.lab10.task1.Complex;

public interface ComplexAbstractFactory {
    public Complex createComplex();
    public Complex createComplex(int real, int image);
}
