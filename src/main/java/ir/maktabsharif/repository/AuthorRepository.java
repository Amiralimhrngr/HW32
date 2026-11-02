package ir.maktabsharif.repository;

import ir.maktabsharif.model.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepository {
    private final List<Author> authors = new ArrayList<>();

    public AuthorRepository() {
        authors.add(new Author(1L, "Robert C. Martin"));
        authors.add(new Author(2L, "Joshua Bloch"));
        authors.add(new Author(3L, "Andrew Hunt"));
    }

    public List<Author> findAll() {
        return new ArrayList<>(authors);
    }

    public Author findById(long id) {
        return authors.stream().filter(author -> author.getId().equals(id)).findFirst().orElse(null);
    }
}
