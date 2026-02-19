package com.centroweg.pablo.librarysystem.domain;

import lombok.Data;

@Data
public class Book {

    private final Long id;
    private String title;
    private String author;
    private int year;

}
