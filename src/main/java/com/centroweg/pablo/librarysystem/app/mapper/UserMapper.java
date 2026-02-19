package com.centroweg.pablo.librarysystem.app.mapper;

import com.centroweg.pablo.librarysystem.app.dto.UserRegisterRequest;
import com.centroweg.pablo.librarysystem.app.dto.UserResponse;
import com.centroweg.pablo.librarysystem.domain.User;

public class UserMapper {

    public User toEntity(UserRegisterRequest request, Long id) {

        return new User(
                id,
                request.name(),
                request.email(),
                request.password()
        );
    }

    public UserResponse toDto(User entity) {

        return new UserResponse(
                entity.getId(),
                entity.getName(),
                entity.getEmail()
        );
    }
}
