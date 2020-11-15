package ru.mirea.lab8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList{

    public void remove(E element) {
        ConcurrentLinkedQueue<E> tmp = new ConcurrentLinkedQueue<E>();
        for (Object el : content) {
            if ((E) el != element) tmp.add((E) el);
        }
        content = tmp;
    }
    public void moveToBack(E element) {
        content.remove(element);
        content.add(element);
    }
}
