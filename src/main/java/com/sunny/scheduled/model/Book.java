package com.sunny.scheduled.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "books")
@Data
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String isbn;
}
