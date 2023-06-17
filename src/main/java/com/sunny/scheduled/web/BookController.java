package com.sunny.scheduled.web;


import com.sunny.scheduled.model.Book;
import com.sunny.scheduled.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping
@AllArgsConstructor
public class BookController {


    private BookRepository bookRepository;

    @GetMapping
    public List<Book> fetchBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("{id}")
    public Book fetchBookById(@PathVariable(required = false) Integer id) {
        return bookRepository.findById(id).get();
    }

    @PostMapping
    public void saveBook(@RequestBody Book book) {
        bookRepository.save(book);
    }


}
