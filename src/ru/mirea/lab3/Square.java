package ru.mirea.lab3;

public class Square extends Rectangle{
    public Square() {
        length = width = 0;
    }
    public Square(double side) {
        length = width = side;
    }
    public Square(double side, String colour, boolean filled) {
        length = width = side;
        this.colour = colour;
        this.filled = filled;
    }
    public double getSide() {
        return width;
    }
    public void setSide (double side) {
        length = width = side;
    }
    @Override
    public String toString() {
        return "Side: " + width + ", colour: " + colour + ", is filled: " + filled;
    }
}

