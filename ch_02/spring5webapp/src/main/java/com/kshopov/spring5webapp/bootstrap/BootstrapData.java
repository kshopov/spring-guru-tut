package com.kshopov.spring5webapp.bootstrap;

import com.kshopov.spring5webapp.model.Author;
import com.kshopov.spring5webapp.model.Book;
import com.kshopov.spring5webapp.repository.AuthorRepository;
import com.kshopov.spring5webapp.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author krasimir = new Author("Krasimir", "Shopov");
        Book ddd = new Book("Domain Driven Design", "1234567890");
        krasimir.getBooks().add(ddd);
        ddd.getAuthors().add(krasimir);

        authorRepository.save(krasimir);
        bookRepository.save(ddd);

        Author dido = new Author("Deyan", "Makaveev");
        Book rrr = new Book("J22EE development", "0987654321");
        dido.getBooks().add(rrr);
        rrr.getAuthors().add(dido);

        authorRepository.save(dido);
        bookRepository.save(rrr);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Number of authors: " + authorRepository.count());
    }
}
