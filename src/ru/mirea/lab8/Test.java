package ru.mirea.lab8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Test {
    public static void main(String[] args) {
        Man man1 = new Man ("Clara", 18);
        Man man2 = new Man ("Petr", 22);
        Man man3 = new Man ("Alex", 19);
        Man man4 = new Man ("Ilya", 25);
        Man man5 = new Man ("George", 20);

        BoundedWaitList<Man> bounded = new BoundedWaitList<Man>(5);
        bounded.add(man2);
        bounded.add(man4);
        bounded.add(man5);

        System.out.println(bounded);
    }

}
