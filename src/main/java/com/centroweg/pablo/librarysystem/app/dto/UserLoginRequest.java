package com.centroweg.pablo.librarysystem.app.dto;

public record UserLoginRequest(
        String email,
        String password
) { }
