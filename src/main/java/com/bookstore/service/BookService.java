package com.bookstore.service;

import com.bookstore.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> books = new ArrayList<>();

    public BookService() {
        books.add(new Book("B01", "Gấu con ham đọc sách", "Tác giả Anhhh", 20000));
        books.add(new Book("B02", "Cáo và thỏ", "Tác giả B", 25000));
    }

    public List<Book> getAllBooks() {
        return books;
    }
}
