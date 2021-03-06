package com.book.service.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Repository to expose as a REST resource.
 *
 * @author afernandez
 */
public interface BookRepository extends JpaRepository<Book, Long> {

    @RestResource(path = "description")
    List<Book> findByDescriptionContaining(@Param("text") String note);
}
