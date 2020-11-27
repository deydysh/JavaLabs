package ru.mirea.lab10.task1;

public class ComplexTest {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        Complex c1 = factory.createComplex();
        Complex c2 = factory.createComplex(10, 3);
        System.out.println(c1);
        System.out.println(c2);
    }
}
