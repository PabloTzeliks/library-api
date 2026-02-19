package com.centroweg.pablo.librarysystem.domain;

import lombok.Data;

@Data
public class User {

    private final Long id;
    private String name;
    private String email;
}
