package com.prakhar.quizservice.repository;

import com.prakhar.quizservice.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository  extends JpaRepository<Quiz,Integer> {
}
