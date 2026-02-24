package com.centroweg.pablo.librarysystem.app.dto;

import com.centroweg.pablo.librarysystem.domain.BookStatus;

public record AddNewBookRequest(
        BookRequest bookRequest,
        BookStatus status,
        int rating
) { }
