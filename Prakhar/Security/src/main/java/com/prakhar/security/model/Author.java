package com.prakhar.security.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Author {
    @Id
    @GeneratedValue
    public int id;

    String firstName;
    String lastName;

}
