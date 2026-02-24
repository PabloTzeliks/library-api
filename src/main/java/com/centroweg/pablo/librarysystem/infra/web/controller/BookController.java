package com.centroweg.pablo.librarysystem.infra.web.controller;

import com.centroweg.pablo.librarysystem.app.dto.AddNewBookRequest;
import com.centroweg.pablo.librarysystem.app.dto.BookResponse;
import com.centroweg.pablo.librarysystem.app.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<BookResponse> add(
            @AuthenticationPrincipal UserDetails userDetails,
            @RequestBody AddNewBookRequest request) {

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(request, userDetails.getUsername()));
    }
}
