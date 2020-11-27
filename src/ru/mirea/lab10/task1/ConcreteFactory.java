package ru.mirea.lab10.task1;

import ru.mirea.lab10.task1.Complex;
import ru.mirea.lab10.task1.ComplexAbstractFactory;

public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}
