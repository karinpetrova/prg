package com.example.demo;

public class Book {
    private String author;
    private String title;
    private boolean borrowed;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public Book() {
        this.borrowed = false;
    }

    public void setToBorrowed() {
        this.borrowed = true;
    }

    public void setToReturned() {
        this.borrowed = false;
    }

    public boolean isBorrowed() {
        return this.borrowed;
    }


}
