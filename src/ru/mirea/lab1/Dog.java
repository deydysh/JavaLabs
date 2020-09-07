package ru.mirea.lab1;

public class Dog {
    private String name;
    private int age;
    public Dog() {
        name = "NoName";
        age = 0;
    }
    public Dog(int n) {
        name = "NoName";
        age = n;
    }
    public Dog(String str) {
        name = str;
        age = 0;
    }
    public Dog(String str, int n) {
        name = str;
        age = n;
    }
    public void setName(String str) {
        name = str;
    }
    public String getName () {
        return name;
    }
    public void setAge(int n) {
        age = n;
    }
    public int getAge () {
        return age;
    }
    public String ToString () {
        return name + ", age " + age;
    }
    public void toHumanAge () {
        System.out.println("In human age: " + age);
    }
}
