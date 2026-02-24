package com.centroweg.pablo.librarysystem.app.dto;

public record BookRequest(
        String isbn,
        String title,
        String authors,
        String thumbnailUrl
) { }
