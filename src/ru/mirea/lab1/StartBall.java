package ru.mirea.lab1;

public class StartBall {
    public static void main (String args[]) {
        Ball ball1 = new Ball();
        Ball ball2 = new Ball(4, "blue");

        ball1.setRadius(6);
        ball1.setColour("red");
        ball1.findSize();

        System.out.println(ball1.ToString());
        System.out.println(ball2.ToString());
    }
}
