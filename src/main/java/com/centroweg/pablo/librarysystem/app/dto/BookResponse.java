package com.centroweg.pablo.librarysystem.app.dto;

import com.centroweg.pablo.librarysystem.domain.BookStatus;

public record BookResponse(
        Long id,
        String isbn,
        String title,
        String authors,
        String thumbnailUrl,
        BookStatus status,
        int rating
) { }
