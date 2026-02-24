package com.centroweg.pablo.librarysystem.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity()
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "isbn", nullable = false)
    private String isbn;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "thumbnail_url", nullable = false)
    private String thumbnailUrl;

    public Book(Long id, String isbn, String title, String author, String thumbnailUrl) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.thumbnailUrl = thumbnailUrl;
    }

    public Book() { }
}
