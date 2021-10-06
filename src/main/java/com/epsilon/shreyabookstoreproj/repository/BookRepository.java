package com.epsilon.shreyabookstoreproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epsilon.shreyabookstoreproj.models.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, String> {

}
