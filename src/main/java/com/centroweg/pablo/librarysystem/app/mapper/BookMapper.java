package com.centroweg.pablo.librarysystem.app.mapper;

import com.centroweg.pablo.librarysystem.app.dto.BookRequest;
import com.centroweg.pablo.librarysystem.domain.Book;

public class BookMapper {

    public Book toDomain(BookRequest request, Long id) {

        return new Book(
                id,
                request.isbn(),
                request.title(),
                request.authors(),
                request.thumbnailUrl()
        );
    }
}
