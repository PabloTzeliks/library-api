package com.centroweg.pablo.librarysystem.infra.persistence.repository;

import com.centroweg.pablo.librarysystem.domain.UserBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserBookRepository extends JpaRepository<UserBook, Long> {
}
