package com.application.frq.Eyaad;

public class Book {
    private String title;
    private String author;

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public String printBookInfo() {
        return "Your book is " + title + ", written by " + author;
    }
}