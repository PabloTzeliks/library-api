package com.centroweg.pablo.librarysystem.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity(name = "book_lending")
public class BookLending {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "book_id", nullable = false, updatable = false)
    private Long bookId;

    @Column(name = "user_id", nullable = false, updatable = false)
    private Long userId;

    @Column(name = "lending_date", nullable = false, updatable = false)
    private LocalDate lendingDate;

    @Column(name = "return_date")
    private LocalDate returnDate;
}
