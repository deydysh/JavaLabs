package ru.mirea.lab1;

public class StartBook {
    public static void main (String args[]) {
        Book book1 = new Book();
        Book book2 = new Book("W. Shakespeare", 1000);

        book1.setAuthor("F. Cooper");
        book1.setPageNum(500);

        System.out.println(book1.ToString());
        System.out.println(book2.ToString());
    }
}
