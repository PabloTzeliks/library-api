package com.centroweg.pablo.librarysystem.infra.persistence.repository;

import com.centroweg.pablo.librarysystem.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<Long, User> {

    User save(User user);
    User findByEmail(String email);
}
