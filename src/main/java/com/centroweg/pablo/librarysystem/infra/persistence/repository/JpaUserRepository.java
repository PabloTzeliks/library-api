package com.centroweg.pablo.librarysystem.infra.persistence.repository;

import com.centroweg.pablo.librarysystem.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaUserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
