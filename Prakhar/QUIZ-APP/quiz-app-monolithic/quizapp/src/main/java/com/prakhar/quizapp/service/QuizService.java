package com.prakhar.quizapp.service;

import com.prakhar.quizapp.model.Question;
import com.prakhar.quizapp.model.QuestionWrapper;
import com.prakhar.quizapp.model.Quiz;
import com.prakhar.quizapp.model.Response;
import com.prakhar.quizapp.repository.QuestionRepository;
import com.prakhar.quizapp.repository.QuizRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
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
    private final QuestionRepository questionRepository;
    public ResponseEntity createQuiz(String category, int numQ, String title) {
        List<Question> questions = questionRepository.getRandomQuestionByCategory(category,numQ);

        Quiz quiz = Quiz.builder()
                .title(title)
                .questions(questions)
                .build();

        Quiz savedQuiz=quizRepository.save(quiz);
        return ResponseEntity.ok(savedQuiz);
    }

    public ResponseEntity getQuizQuestions(int id) {
        Optional<Quiz> quiz= quizRepository.findById(id);
        if(quiz.isPresent()){
            List<Question> questionList = quiz.get().getQuestions();
            List<QuestionWrapper> questionForUser= new ArrayList<>();

            for (Question q:questionList) {
                QuestionWrapper qw= QuestionWrapper
                        .builder()
                        .id(q.getId())
                        .questionTitle(q.getQuestionTitle())
                        .option1(q.getOption1())
                        .option2(q.getOption2())
                        .option3(q.getOption3())
                        .option4(q.getOption4())
                        .build();
                questionForUser.add(qw);
            }
            return ResponseEntity.ok(questionForUser);
        }
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
        Quiz quiz = quizRepository.findById(id).get();
        List<Question> questions = quiz.getQuestions();
        int right = 0;
        int i = 0;
        for(Response response : responses){
            if(response.getResponse().equals(questions.get(i).getRightAnswer()))
                right++;

            i++;
        }
        return ResponseEntity.ok(right);
    }

}
