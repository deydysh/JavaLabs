package ru.mirea.lab1;

public class Ball {
    private double size;
    private int radius;
    private String colour;
    public Ball () {
        radius = 0;
        colour = "none";
    }
    public Ball (int r) {
        size = r*r*r*3.14*4/3;
        radius = r;
        colour = "none";
    }
    public Ball (int r, String str) {
        size = r*r*r*3.14*4/3;
        radius = r;
        colour = str;
    }
    public Ball (String str) {
        radius = 0;
        colour = str;
    }
    public void setRadius (int r) {
        radius = r;
    }
    public int getRadius() {
        return radius;
    }
    public double getSize() {
        return size;
    }
    public void setColour (String str) {
        colour = str;
    }
    public String getColour () {
        return colour;
    }
    public String ToString() {
        return "Radius: " + radius + ", size: " + size + ", colour: " + colour;
    }
    public void findSize() {
        size = radius*radius*radius*3.14*4/3;
    }
}
