package ru.mirea.lab8;

public class BoundedWaitList<E> extends WaitList{
    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(Object element) {
        if (capacity > 0) {
            content.add(element);
            capacity--;
        }
        else System.out.println("Can't insert");
    }

    @Override
    public String toString() {
        return "capacity: " + capacity + "\n" + super.toString();
    }
}
