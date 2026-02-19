package com.centroweg.pablo.librarysystem.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private final Long id;

    @Column(name = "name", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "year", nullable = false)
    private int year;
}
