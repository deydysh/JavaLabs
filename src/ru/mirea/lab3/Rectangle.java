package ru.mirea.lab3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        width = 0;
        length = 0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String colour, boolean filled) {
        this.width = width;
        this.length = length;
        this.colour = colour;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return width*length;
    }
    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }
    @Override
    public String toString() {
        return "Width: " + width + ", length: " + length + ", colour: " + colour + ", is filled: " + filled;
    }
}
