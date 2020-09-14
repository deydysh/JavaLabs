package ru.mirea.lab2;

import javax.sound.midi.Soundbank;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(12.3, 11.4);
        Ball b2 = new Ball();
        b2.setXY(10, -3);

        b1.move(11, 10.3);
        b2.move(-5.4, -3);

        System.out.println(b1);
        System.out.println(b2);
    }
}
