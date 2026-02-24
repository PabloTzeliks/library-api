package com.centroweg.pablo.librarysystem.infra.persistence.repository;

import com.centroweg.pablo.librarysystem.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaBookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findByIsbn(String isbn);
}
