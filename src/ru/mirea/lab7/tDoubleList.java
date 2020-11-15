package ru.mirea.lab7;

import java.util.LinkedList;
import java.util.Queue;

public class tDoubleList {
    public tDoubleList(int f[], int s[]) {
        LinkedList<Integer> first = new LinkedList<>();
        LinkedList<Integer> second = new LinkedList<>();

        for (int i = 0; i< 5; i++) {
            first.add(f[i]);
            second.add(s[i]);
        }

        int turn = 0;
        while (!first.isEmpty() && !second.isEmpty() && turn < 106) {
            if (first.peek() > second.peek()) {
                if (first.peek() == 9 && second.peek() == 0) {
                    second.add(first.peek());
                    second.add(second.peek());
                }
                else {
                    first.add(first.peek());
                    first.add(second.peek());
                }
            }
            else {
                if (first.peek() == 0 && second.peek() == 9) {
                    first.add(first.peek());
                    first.add(second.peek());
                }
                else {
                    second.add(first.peek());
                    second.add(second.peek());
                }
            }
            first.poll();
            second.poll();
            turn++;
        }
        if (turn < 106) {
            if (first.size() == 0) System.out.println("second " + turn);
            if (second.size() == 0) System.out.println("first " + turn);
        }
        else System.out.println("botva");
    }

    public static void main(String[] args) {
        int f[] = new int[]{1,3,5,7,9};
        int s[] = new int[]{2,4,6,8,0};
        tDoubleList doubleList = new tDoubleList(f,s);
    }
}
