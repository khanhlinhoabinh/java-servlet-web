package com.bookstore.model;

public class Book {
    private String id;
    private String title;
    private String author;
    private double price;

    public Book(String id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter
    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    // Setter
    public void setId(String id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPrice(double price) { this.price = price; }
}