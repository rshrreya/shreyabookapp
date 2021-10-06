package com.epsilon.shreyabookstoreproj.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.epsilon.shreyabookstoreproj.models.Publisher;
import com.epsilon.shreyabookstoreproj.services.PublisherServices;

public class PublisherContoller {
	
	  @Autowired
	    private PublisherServices publisherService;
	    @PostMapping(path = "/publisher")
	public Publisher createPublisher(@RequestBody Publisher publisher){
	        return this.publisherService.createPublisher1(publisher);
	    }


	    @GetMapping(path="/publisher")
	public List<Publisher> getAllPublishers(){
	        return this.publisherService.getAllPublishers2();
	    }

	@GetMapping(path = "publisher/{id}")
	public Optional<Publisher> getPublisher(@PathVariable String id) {
	    return this.publisherService.getPublisher3(id);
	}


	@PutMapping(path = "/publisher/{id}")

	public Publisher updatePublisher(@PathVariable String id, @RequestBody Publisher pb){
	    return this.publisherService.updatePublisher5(id,pb);
	}


	@DeleteMapping(path = "/publisher/{id}")
	public void deletePublisher(@PathVariable String id){
	         this.publisherService.deletePublisher1(id);
	}

}
