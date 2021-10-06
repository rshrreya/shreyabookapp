package com.epsilon.shreyabookstoreproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epsilon.shreyabookstoreproj.models.Author;

@Repository

public interface AuthorRepository extends JpaRepository<Author, String> {

}
