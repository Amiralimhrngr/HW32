package ir.maktabsharif.service;

import ir.maktabsharif.model.Book;
import ir.maktabsharif.repository.BookRepository;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
public class BookService {
    private final BookRepository bookRepository;
    @Getter
    private String libraryName;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(Long id) {
        return bookRepository.findById(id);
    }

    public void add(Book book) {
        bookRepository.add(book);
    }
}
