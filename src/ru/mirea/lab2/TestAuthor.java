package ru.mirea.lab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Pushkin", "pushkin.a.s@mail.ru", 'M');
        Author a2 = new Author("Cooper", "smth@mail.com", 'M');
        System.out.println(a1);
        System.out.println(a2);
    }
}
