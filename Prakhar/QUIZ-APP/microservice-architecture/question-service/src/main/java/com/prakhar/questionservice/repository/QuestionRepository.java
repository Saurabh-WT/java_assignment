package com.prakhar.questionservice.repository;

import com.prakhar.questionservice.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
    List<Question> findByCategory(String category);
    @Query(value = "SELECT q.id FROM question q WHERE q.category=:category ORDER BY RANDOM() LIMIT :numQ",nativeQuery = true)
    List<Integer> getRandomQuestionByCategory(String category, int numQ);
}
