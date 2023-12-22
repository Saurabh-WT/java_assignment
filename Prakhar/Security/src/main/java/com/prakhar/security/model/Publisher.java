package com.prakhar.security.model;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
public class Publisher {
    @Id
    @GeneratedValue
    public int id;

    public String publisherName;

}
