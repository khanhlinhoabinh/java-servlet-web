package com.bookstore.servlet;

import com.bookstore.service.BookService;
import com.bookstore.model.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class BookServlet extends HttpServlet {

    private BookService bookService = new BookService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<Book> books = bookService.getAllBooks();
        resp.setContentType("text/html;charset=UTF-8");

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
