package com.prakhar.security.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    @Id
    @GeneratedValue
    public Integer id;

    public String bookName;

    @ManyToOne
    @JoinColumn(name="author_id")
    public Author author;

    @Embedded
    public Publisher publisher;

    @ManyToOne
    @JoinColumn(name = "library_id")
    @JsonBackReference
    private Library library;

    @CreationTimestamp
    public LocalDateTime created_at;

    @UpdateTimestamp
    public LocalDateTime updated_at;


}
