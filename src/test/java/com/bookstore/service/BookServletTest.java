package com.bookstore.service ;

import com.bookstore.model.Book;
import com.bookstore.service.BookService;
import com.bookstore.servlet.BookServlet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import static org.mockito.Mockito.*;

public class BookServletTest {

    private BookServlet servlet;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private StringWriter stringWriter;
    private PrintWriter writer;

    @BeforeEach
    public void setup() throws Exception {
        // Khởi tạo servlet và các đối tượng giả lập
        servlet = new BookServlet();
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);

        stringWriter = new StringWriter();
        writer = new PrintWriter(stringWriter);

        when(response.getWriter()).thenReturn(writer);
    }

    @Test
    public void testDoGetShouldPrintBookListHtml() throws Exception {
        // Gọi phương thức doGet
        servlet.doGet(request, response);

        writer.flush(); // Đảm bảo dữ liệu được ghi ra StringWriter

        String output = stringWriter.toString();

        // Kiểm tra HTML xuất ra có đúng tiêu đề
        assert(output.contains("Danh sách sách thiếu nhi"));
        
    }
}
