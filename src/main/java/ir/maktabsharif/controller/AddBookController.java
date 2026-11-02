package ir.maktabsharif.controller;

import ir.maktabsharif.model.Book;
import ir.maktabsharif.service.AuthorService;
import ir.maktabsharif.service.BookService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class AddBookController implements Controller {
    private final BookService bookService;
    private final AuthorService authorService;

    public AddBookController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @Override
    public @Nullable ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        if (request.getMethod().equalsIgnoreCase("get")) {
            ModelAndView modelAndView = new ModelAndView("add-book");
            modelAndView.addObject("authors", authorService.findAll());
            return modelAndView;
        }
        if (request.getMethod().equalsIgnoreCase("post")) {
            String title = request.getParameter("title");
            int pages = Integer.parseInt(request.getParameter("pages"));
            Long authorId = Long.parseLong(request.getParameter("authorId"));
            bookService.add(new Book(null, title, authorId, pages));
            response.sendRedirect(request.getContextPath() + "/books");
            return null;
        }
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
        return null;
    }
}
