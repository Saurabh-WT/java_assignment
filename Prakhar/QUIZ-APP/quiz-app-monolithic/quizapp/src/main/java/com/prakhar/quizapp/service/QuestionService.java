package com.prakhar.quizapp.service;

import com.prakhar.quizapp.model.Question;
import com.prakhar.quizapp.model.Quiz;
import com.prakhar.quizapp.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;
    public ResponseEntity getAllQuestion() {
        List<Question> ques= questionRepository.findAll();
        return ResponseEntity.ok(ques);
    }

    public ResponseEntity getQuestionByCategory(String category) {
        List<Question> ques= questionRepository.findByCategory(category);

        return ResponseEntity.ok(ques);
    }

    public ResponseEntity addQuestion(Question question) {
        Question saveQuestion=questionRepository.save(question);
        return ResponseEntity.ok(saveQuestion);
    }

    public ResponseEntity updateQuestion(int id, Question updatedQues) {
        Optional<Question> question = questionRepository.findById(id);
        if(question.isPresent()){
            Question existingQues = question.get();

            System.out.println();
            //to update right answer property
            if(updatedQues.getRightAnswer()!=null){
                existingQues.setRightAnswer(updatedQues.getRightAnswer());
            }

            //need to add other properties


            Question savedQues = questionRepository.save(existingQues);

            return ResponseEntity.ok(updatedQues);
        }

        return ResponseEntity.notFound().build();
    }
}
