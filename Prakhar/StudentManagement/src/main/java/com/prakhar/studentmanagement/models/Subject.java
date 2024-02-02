package com.prakhar.studentmanagement.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Subject {
    @Id
    Long id;

    @Column(name = "subject_code")
    String subjectCode;

    @Column(name = "subject_name")
    String subjectName;


    @CreationTimestamp
    @Column(name = "created_at")
    public LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    public LocalDateTime updatedAt;
}
