package com.bookstore.service;

import com.bookstore.model.Book;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookServiceTest {

    @Test
    public void testGetAllBooksReturnsList() {
        BookService service = new BookService();
        List<Book> books = service.getAllBooks();
        assertFalse(books.isEmpty());
    }
}
