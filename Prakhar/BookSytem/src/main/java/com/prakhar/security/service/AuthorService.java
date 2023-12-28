package com.prakhar.security.service;


import com.prakhar.security.model.Author;
import com.prakhar.security.repository.AuthorRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author updateAuthor(Integer authorId, Author updatedAuthor) {
        Optional<Author> optionalAuthor = authorRepository.findById(authorId);

        if (optionalAuthor.isPresent()) {
            Author existingAuthor = optionalAuthor.get();

            // Update only specific fields
            existingAuthor.setFirstName(updatedAuthor.getFirstName());
            existingAuthor.setLastName(updatedAuthor.getLastName());

            // You can add more fields to update if needed

            return authorRepository.save(existingAuthor);
        } else {
            throw new EntityNotFoundException("Author not found with id: " + authorId);
        }
    }


}
