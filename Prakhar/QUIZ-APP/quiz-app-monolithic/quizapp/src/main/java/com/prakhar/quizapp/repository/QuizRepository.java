package com.prakhar.quizapp.repository;

import com.prakhar.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository  extends JpaRepository<Quiz,Integer> {
}
