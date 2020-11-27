package ru.mirea.lab10.task2;

public class ChairTest {
    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();
        Chair ch1 = factory.createFunctionalChair();
        Chair ch2 = factory.createMagicChair();
        Chair ch3 = factory.createVictorianChair();

        Client client = new Client();
        client.setChair(ch1);
        client.sit();
        client.setChair(ch2);
        client.sit();
        client.setChair(ch3);
        client.sit();
    }
}
