package ru.mirea.lab3;

public class Circle extends Shape {
    protected double radius;
    public Circle() {
        radius = 0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String colour, boolean filled) {
        this.radius = radius;
        this.colour = colour;
        this.filled = filled;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }
    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return "Radius: " + radius + ", colour: " + colour + ", is filled: " + filled;

    }
}
