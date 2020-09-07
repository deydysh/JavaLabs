package ru.mirea.lab1;

public class Book {
    private String author;
    private int pageNum;
    public Book (String str, int n) {
        author = str;
        pageNum = n;
    }
    public Book () {
        author = "none";
        pageNum = 0;
    }
    public void setAuthor(String str) {
        author = str;
    }
    public String getAuthor() {
        return author;
    }
    public void setPageNum (int n) {
        pageNum = n;
    }
    public int getPageNum () {
        return pageNum;
    }
    public String ToString () {
        return "author: " + author + ", number of pages: " + pageNum;
    }
}
