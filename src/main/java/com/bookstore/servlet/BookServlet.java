package com.bookstore.servlet;

import com.bookstore.service.BookService;

import jakarta.servlet.annotation.WebServlet;

import com.bookstore.model.Book;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/books") 
public class BookServlet extends HttpServlet {

    private BookService bookService = new BookService();

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("BookServlet loaded!");

        // Thiết lập định dạng phản hồi
        resp.setContentType("text/html;charset=UTF-8");

        
        List<Book> books = bookService.getAllBooks();

        // In ra HTML
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Sách thiếu nhi</title></head><body>");
        out.println("<h1>Danh sách sách thiếu nhi</h1>");
        out.println("<ul>");
        for (Book book : books) {
            out.println("<li>" + book.getTitle() + " - " + book.getAuthor() + " - " + book.getPrice() + "đ</li>");
        }
        out.println("</ul>");
        out.println("</body></html>");
    }
}
