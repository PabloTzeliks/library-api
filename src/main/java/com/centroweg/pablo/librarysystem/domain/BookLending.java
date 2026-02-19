package com.centroweg.pablo.librarysystem.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BookLending {

    private final Long id;
    private final Long bookId;
    private final Long userId;

    private LocalDate lendingDate;
    private LocalDate returnDate;
}
