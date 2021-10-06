package com.epsilon.shreyabookstoreproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epsilon.shreyabookstoreproj.models.Publisher;

@Repository

public interface PublisherRepository extends JpaRepository<Publisher, String> {

}
