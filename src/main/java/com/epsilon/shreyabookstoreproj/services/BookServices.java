package com.epsilon.shreyabookstoreproj.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;


import com.epsilon.shreyabookstoreproj.models.Author;
import com.epsilon.shreyabookstoreproj.models.Book;
import com.epsilon.shreyabookstoreproj.models.Publisher;
import com.epsilon.shreyabookstoreproj.repository.AuthorRepository;
import com.epsilon.shreyabookstoreproj.repository.BookRepository;
import com.epsilon.shreyabookstoreproj.repository.PublisherRepository;

public class BookServices {

	@Autowired
	private BookRepository Bookrepo;
	@Autowired
	private AuthorRepository Authorepo;
	@Autowired
	private PublisherRepository publisherRepo;
	public Book createBook(Book book) {
	    book.setId(UUID.randomUUID().toString());
	    Author author =this.Authorepo.findById(book.getAuthor().getAuthorID()).get();
	    Publisher pb=this.publisherRepo.findById(book.getPublisher().getId()).get();
	    book.setAuthor(author);
	    book.setPublisher(pb);
	    return this.Bookrepo.save(book);



	}

	public List<Book> getBooks() {
	    return this.Bookrepo.findAll();
	}

	public Optional<Book> getBookById(String id) {
	    return this.Bookrepo.findById(id);
	}

	public Book updateBook(String id, Book book) {
	    book.setId(id);
	    Author author= this.Authorepo.findById(book.getAuthor().getAuthorID()).get();
	    Publisher pb=this.publisherRepo.findById(book.getPublisher().getId()).get();
	    book.setAuthor(author);
	    book.setPublisher(pb);
	    return this.Bookrepo.save(book);
	}

}
