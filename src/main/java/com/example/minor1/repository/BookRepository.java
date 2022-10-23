package com.example.minor1.repository;

import com.example.minor1.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//entity for BookRepository is Book ,the primary key in Book Table will be id and its datatype is Integer
public interface BookRepository extends JpaRepository<Book,Integer> {
}
