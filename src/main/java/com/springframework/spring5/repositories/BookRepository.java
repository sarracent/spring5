package com.springframework.spring5.repositories;


import com.springframework.spring5.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
