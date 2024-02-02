package com.prakhar.quizservice.controller;
import com.prakhar.quizservice.model.QuestionWrapper;
import com.prakhar.quizservice.model.QuizDto;
import com.prakhar.quizservice.model.Response;
import com.prakhar.quizservice.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
@RequiredArgsConstructor
public class QuizController {

    private final QuizService quizService;

    @PostMapping("/create")
    public ResponseEntity createQuiz(@RequestBody QuizDto quizDto){
        return quizService.createQuiz(quizDto.getCategoryName(), quizDto.getNumQ(), quizDto.getTitle());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable int id){
        return quizService.getQuizQuestions(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses){
        return quizService.calculateResult(id, responses);
    }

}
