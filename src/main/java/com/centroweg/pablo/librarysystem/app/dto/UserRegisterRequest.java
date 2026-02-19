package com.centroweg.pablo.librarysystem.app.dto;

public record UserRegisterRequest(
        String name,
        String email,
        String password
) { }
