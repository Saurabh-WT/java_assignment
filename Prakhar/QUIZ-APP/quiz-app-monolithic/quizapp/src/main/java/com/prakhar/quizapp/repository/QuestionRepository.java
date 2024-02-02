package com.prakhar.quizapp.repository;

import com.prakhar.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
    List<Question> findByCategory(String category);
    @Query(value = "SELECT * FROM question q WHERE q.category=:category ORDER BY RANDOM() LIMIT :numQ",nativeQuery = true)
    List<Question> getRandomQuestionByCategory(String category, int numQ);
}
