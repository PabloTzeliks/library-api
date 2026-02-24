package com.centroweg.pablo.librarysystem.infra.persistence.repository;

import com.centroweg.pablo.librarysystem.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaBookRepository extends JpaRepository<Book, Long> {
}
