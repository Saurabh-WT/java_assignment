package com.prakhar.quizservice.service;

import com.prakhar.quizservice.feign.QuizInterface;
import com.prakhar.quizservice.model.QuestionWrapper;
import com.prakhar.quizservice.model.Quiz;
import com.prakhar.quizservice.model.Response;
import com.prakhar.quizservice.repository.QuizRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
//@RequiredArgsConstructor
@AllArgsConstructor
public class QuizService {
    private final QuizRepository quizRepository;
//    private final QuestionRepository questionRepository;
    @Autowired
    QuizInterface quizInterface;
    public ResponseEntity createQuiz(String category, int numQ, String title) {
        List<Integer> questions = quizInterface.getQuestionForQuiz(category,numQ).getBody();

        Quiz quiz = Quiz.builder()
                .title(title)
                .questionsIds(questions)
                .build();

        Quiz savedQuiz=quizRepository.save(quiz);
//        return ResponseEntity.ok(savedQuiz);
        return ResponseEntity.ok("Success");
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id) {
        Optional<Quiz> quiz= quizRepository.findById(id);
        if(quiz.isPresent()){

            List<Integer> questionList = quiz.get().getQuestionsIds();
            List<QuestionWrapper> questionForUser=quizInterface.getQuestionFromId(questionList).getBody();

            return ResponseEntity.ok(questionForUser);
        }
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {

        ResponseEntity<Integer> score = quizInterface.getScore(responses);

        return score;
    }

}
