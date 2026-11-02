package ir.maktabsharif.repository;

import ir.maktabsharif.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    public static final List<Book> books = new ArrayList<>();

    private long nextId = 4;

    public BookRepository() {
        books.add(new Book(1L, "Clean Code", 1L, 464));
        books.add(new Book(2L, "Effective Java", 2L, 416));
        books.add(new Book(3L, "The Pragmatic Programmer", 3L, 352));
    }

    public List<Book> findAll() {
        return new ArrayList<>(books);
    }

    public Book findById(Long id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }

    public void add(Book book) {
        book.setId(nextId);
        nextId++;
        books.add(book);
    }
}
