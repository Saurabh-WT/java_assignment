package com.prakhar.booksystem.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.prakhar.booksystem.model.Author;
import com.prakhar.booksystem.model.Book;
import com.prakhar.booksystem.model.Library;
import com.prakhar.booksystem.model.Publisher;
import com.prakhar.booksystem.repository.AuthorRepository;
import com.prakhar.booksystem.repository.BookHistoryRepository;
import com.prakhar.booksystem.repository.BookRepository;
import com.prakhar.booksystem.repository.LibraryRepository;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {BookService.class})
@ExtendWith(SpringExtension.class)
class BookServiceDiffblueTest {
    @MockBean
    private AuthorRepository authorRepository;

    @MockBean
    private AuthorService authorService;

    @MockBean
    private BookHistoryRepository bookHistoryRepository;

    @MockBean
    private BookRepository bookRepository;

    @Autowired
    private BookService bookService;

    @MockBean
    private LibraryRepository libraryRepository;

    @MockBean
    private LibraryService libraryService;

    /**
     * Method under test: {@link BookService#getAllBooks()}
     */
    @Test
    void testGetAllBooks() {
        // Arrange
        when(bookRepository.findAll()).thenReturn(new ArrayList<>());

        // Act
        ResponseEntity actualAllBooks = bookService.getAllBooks();

        // Assert
        verify(bookRepository).findAll();
        assertEquals("Books not found", actualAllBooks.getBody());
        assertEquals(200, actualAllBooks.getStatusCodeValue());
        assertTrue(actualAllBooks.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link BookService#getAllBooks()}
     */
    @Test
    void testGetAllBooks2() {
        // Arrange
        Author author = new Author();
        author.setCreated_at(LocalDate.of(1970, 1, 1).atStartOfDay());
        author.setFirstName("Jane");
        author.setId(1);
        author.setLastName("Doe");
        author.setUpdated_at(LocalDate.of(1970, 1, 1).atStartOfDay());

        Library library = new Library();
        library.setBooks(new ArrayList<>());
        library.setCreated_at(LocalDate.of(1970, 1, 1).atStartOfDay());
        library.setId(1L);
        library.setLibraryName("Books not found");
        library.setUpdated_at(LocalDate.of(1970, 1, 1).atStartOfDay());

        Book book = new Book();
        book.setAuthor(author);
        book.setBookName("Books not found");
        book.setCreatedTimestamp(LocalDate.of(1970, 1, 1).atStartOfDay());
        book.setId(1);
        book.setLibrary(library);
        book.setPublisher(new Publisher());
        book.setUpdatedTimestamp(LocalDate.of(1970, 1, 1).atStartOfDay());

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book);
        when(bookRepository.findAll()).thenReturn(bookList);

        // Act
        ResponseEntity actualAllBooks = bookService.getAllBooks();

        // Assert
        verify(bookRepository).findAll();
        assertEquals(200, actualAllBooks.getStatusCodeValue());
        assertTrue(actualAllBooks.hasBody());
        assertTrue(actualAllBooks.getHeaders().isEmpty());
    }
}
