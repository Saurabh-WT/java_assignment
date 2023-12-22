package com.prakhar.security.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    @Id
    @GeneratedValue
    public int id;

    public String name;

    @ManyToOne
    public Author author;

    @Embedded
    public Publisher publisher;



}
