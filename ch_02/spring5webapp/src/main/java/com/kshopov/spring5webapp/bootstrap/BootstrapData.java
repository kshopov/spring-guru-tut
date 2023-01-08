package com.kshopov.spring5webapp.bootstrap;

import com.kshopov.spring5webapp.model.Author;
import com.kshopov.spring5webapp.model.Book;
import com.kshopov.spring5webapp.model.Publisher;
import com.kshopov.spring5webapp.repository.AuthorRepository;
import com.kshopov.spring5webapp.repository.BookRepository;
import com.kshopov.spring5webapp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository,
                         BookRepository bookRepository,
                         PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in Bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("KShopov Publishing");
        publisher.setCity("Plovdiv");
        publisher.setState("PLD");

        publisherRepository.save(publisher);

        System.out.println("Publisher Count: " + publisherRepository.count());

        Author krasimir = new Author("Krasimir", "Shopov");
        Book ddd = new Book("Domain Driven Design", "1234567890");
        krasimir.getBooks().add(ddd);
        ddd.getAuthors().add(krasimir);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(krasimir);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author dido = new Author("Deyan", "Makaveev");
        Book rrr = new Book("J22EE development", "0987654321");
        dido.getBooks().add(rrr);
        rrr.getAuthors().add(dido);

        rrr.setPublisher(publisher);
        publisher.getBooks().add(rrr);

        authorRepository.save(dido);
        bookRepository.save(rrr);
        publisherRepository.save(publisher);

        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Number of authors: " + authorRepository.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());
    }
}
