package com.centroweg.pablo.librarysystem.app.service;

import com.centroweg.pablo.librarysystem.app.dto.UserRegisterRequest;
import com.centroweg.pablo.librarysystem.app.dto.UserResponse;
import com.centroweg.pablo.librarysystem.app.mapper.UserMapper;
import com.centroweg.pablo.librarysystem.domain.User;
import com.centroweg.pablo.librarysystem.domain.common.exception.BusinessRuleException;
import com.centroweg.pablo.librarysystem.infra.persistence.repository.JpaUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final JpaUserRepository userRepository;
    private final PasswordEncoder encoder;
    private final UserMapper userMapper;

    public UserService(JpaUserRepository userRepository, PasswordEncoder encoder, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.encoder = encoder;
        this.userMapper = userMapper;
    }

    public UserResponse register(UserRegisterRequest request) {

        if (userRepository.findByEmail(request.email()).isPresent()) {
            throw new BusinessRuleException("Email already in use: " + request.email());
        }

        User newUser = userMapper.toEntity(request, null);

        var hashedPassword = encoder.encode(request.password());
        newUser.setPassword(hashedPassword);

        return userMapper.toDto(userRepository.save(newUser));
    }

    public UserResponse login(String email) {

        return userMapper.toDto(userRepository.findByEmail(email)
                .orElseThrow(() -> new BusinessRuleException("User not found with email: " + email)));
    }
}
