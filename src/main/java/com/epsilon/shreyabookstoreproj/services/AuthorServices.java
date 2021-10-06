package com.epsilon.shreyabookstoreproj.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epsilon.shreyabookstoreproj.models.Author;
import com.epsilon.shreyabookstoreproj.repository.AuthorRepository;

@Service
public class AuthorServices {
	
	@Autowired
	private AuthorRepository authorrepo;

	public Author createAuthor(Author player) {
		// TODO Auto-generated method stub
		
		player.setAuthorID(UUID.randomUUID().toString());
		authorrepo.save(player);
		return player;
	}

	public List<Author> getAllAuthors() {
		// TODO Auto-generated method stub
		return this.authorrepo.findAll();
	}

	public Optional<Author> getAuthorById(String authorID) {
		   
		   return this.authorrepo.findById(authorID);
		}

	public void deletePlayerById(String authorID) {
		// TODO Auto-generated method stub
		this.authorrepo.deleteById(authorID);
		
	}


}
