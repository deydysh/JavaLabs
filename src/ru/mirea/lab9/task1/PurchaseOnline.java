package ru.mirea.lab9.task1;

public class PurchaseOnline {
    private String name;
    private long numberINN;

    public PurchaseOnline(String name, long numberINN) {
        this.name = name;
        this.numberINN = numberINN;
    }

    public String getName() {
        return name;
    }

    public long getNumberINN() {
        return numberINN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberINN(long numberINN) {
        this.numberINN = numberINN;
    }
}
