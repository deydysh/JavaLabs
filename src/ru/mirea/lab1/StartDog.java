package ru.mirea.lab1;

public class StartDog {
    public static void main (String args[]) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Bubble");
        Dog dog3 = new Dog("Mike", 10);

        dog1.setName("Jack");
        dog1.setAge(8);
        dog2.setAge(5);
        dog3.toHumanAge();
        System.out.println(dog2.ToString());
    }
}
