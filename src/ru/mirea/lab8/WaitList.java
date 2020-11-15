package ru.mirea.lab8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;


public class WaitList<E> implements IWaitList{
    protected ConcurrentLinkedQueue<E> content;
    public WaitList () {
        content = new ConcurrentLinkedQueue<>();
    }
    public WaitList (Collection<E> c) {
        content = (ConcurrentLinkedQueue) c;
    }

    @Override
    public String toString() {
        return "queue=" + content;
    }

    @Override
    public void add(Object element) {
        content.add((E) element);
    }

    @Override
    public E remove() {
        return content.poll();
    }
    @Override
    public boolean contains(Object element){
        boolean flag = false;
        for (E el : content) {
            if ((E) element == el) flag = true;
        }
        return flag;
    }

    @Override
    public boolean containsAll(Collection c) {
        int count = 0;
        for (E element : content) {
            for (Object el : c) {
                if ((E) el == element) {
                    count++;
                    break;
                }
            }
        }
        if (c.size() == count) return true;
        else return false;
    }

    @Override
    public boolean IsEmpty() {
        return content.isEmpty();
    }
}
