package ru.mirea.lab10.task1;

public class Complex {
    private int real;
    private int image;

    public Complex() {
        this.real = 0;
        this.image = 0;
    }

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public float getReal() {
        return real;
    }

    public float getIm() {
        return image;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setIm(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return real + " " + image + "i";
    }
}
