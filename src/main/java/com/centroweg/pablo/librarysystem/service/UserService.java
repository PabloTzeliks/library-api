package com.centroweg.pablo.librarysystem.service;

import com.centroweg.pablo.librarysystem.domain.User;
import com.centroweg.pablo.librarysystem.infra.persistence.repository.JpaUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserService {

    private final JpaUserRepository userRepository;
    private final PasswordEncoder encoder;

    public UserService(JpaUserRepository userRepository, PasswordEncoder encoder) {
        this.userRepository = userRepository;
        this.encoder = encoder;
    }

    public User register(User newUser) {

        var hashedPassword = encoder.encode(newUser.getPassword());
        newUser.setPassword(hashedPassword);

        return userRepository.save(newUser);
    }
}
