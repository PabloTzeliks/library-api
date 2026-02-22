package com.centroweg.pablo.librarysystem.infra.web.controller;

import com.centroweg.pablo.librarysystem.app.dto.UserLoginRequest;
import com.centroweg.pablo.librarysystem.app.dto.UserRegisterRequest;
import com.centroweg.pablo.librarysystem.app.dto.UserResponse;
import com.centroweg.pablo.librarysystem.domain.User;
import com.centroweg.pablo.librarysystem.app.service.AuthenticationService;
import com.centroweg.pablo.librarysystem.app.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@RequestBody UserRegisterRequest request) {

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<UserResponse> login(@AuthenticationPrincipal UserDetails userDetails) {

        String email = userDetails.getUsername();

        return ResponseEntity.ok(userService.login(email));
    }
}
