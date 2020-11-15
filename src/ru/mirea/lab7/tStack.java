package ru.mirea.lab7;

import java.util.ArrayDeque;

public class tStack {
    public tStack (int[]f, int[]s) {

       ArrayDeque<Integer> first = new ArrayDeque<>();
       ArrayDeque<Integer> second = new ArrayDeque<>();

        for (int i = 0; i < 5; i++) {
            first.addLast(f[i]);
            second.addLast(s[i]);
        }

        int turn = 0;
        while (first.size() != 0 && second.size() != 0 && turn < 106) {
            if (first.peek() > second.peek()) {
                if (first.peek() == 9 && second.peek() == 0) {
                    second.addLast(first.getFirst());
                    second.addLast(second.getFirst());
                }
                else {
                    first.addLast(first.getFirst());
                    first.addLast(second.getFirst());
                }
            }
            else {
                if (first.peek() == 0 && second.peek() == 9) {
                    first.addLast(first.getFirst());
                    first.addLast(second.getFirst());
                }
                else {
                    second.addLast(first.getFirst());
                    second.addLast(second.getFirst());
                }
            }
            first.pop();
            second.pop();
            turn++;
        }
        if (turn < 106) {
            if (first.size() == 0) System.out.println("second " + turn);
            if (second.size() == 0) System.out.println("first " + turn);
        } else System.out.println("botva");
    }

    public static void main(String[] args) {
        int f[] = new int[]{1,3,5,7,9};
        int s[] = new int[]{2,4,6,8,0};
        tStack stack = new tStack(f,s);
    }
}
