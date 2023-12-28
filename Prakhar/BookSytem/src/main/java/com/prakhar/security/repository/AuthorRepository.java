package com.prakhar.security.repository;

import com.prakhar.security.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
    Author findByFirstNameAndLastName(String firstName,String lastName);
}
