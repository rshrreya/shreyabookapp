package com.epsilon.shreyabookstoreproj.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.epsilon.shreyabookstoreproj.models.Publisher;
import com.epsilon.shreyabookstoreproj.repository.PublisherRepository;

public class PublisherServices {

	 @Autowired
	    private PublisherRepository publisherRepo;
	 public Publisher createPublisher1(Publisher publisher) {
	        publisher.setId(UUID.randomUUID().toString());
	        return this.publisherRepo.save(publisher);
	    }

	    public List<Publisher> getAllPublishers2() {

	            return this.publisherRepo.findAll();
	    }

	    public Optional<Publisher> getPublisher3(String id) {
	        return this.publisherRepo.findById(id);
	    }

	    public Publisher updatePublisher5(String id, Publisher pb) {
	        pb.setId(id);
	        return this.publisherRepo.getById(id);
	    }

	    public void deletePublisher1(String id) {
	this.publisherRepo.deleteById(id);
	    }

}
