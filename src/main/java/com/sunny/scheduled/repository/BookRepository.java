package com.sunny.scheduled.repository;


import com.sunny.scheduled.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Integer> {
    Optional<Book> findById(Integer id) ;
}
