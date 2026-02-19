package com.centroweg.pablo.librarysystem.infra.web.controller;

import com.centroweg.pablo.librarysystem.domain.User;
import com.centroweg.pablo.librarysystem.app.service.AuthenticationService;
import com.centroweg.pablo.librarysystem.app.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final AuthenticationService authService;

    public UserController(UserService userService, AuthenticationService authService) {
        this.userService = userService;
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User newUser) {

        User createdUser =  userService.register(newUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login()
}
