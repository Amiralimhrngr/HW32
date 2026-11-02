package ir.maktabsharif.service;

import ir.maktabsharif.model.Author;
import ir.maktabsharif.repository.AuthorRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    public Author findById(Long id) {
        return authorRepository.findById(id);
    }

    public Map<Long, String> getNameMap() {
        return authorRepository.findAll().stream()
                .collect(Collectors.toMap(Author::getId, Author::getName));
    }
}
