package com.prakhar.quizapp.controller;

import com.prakhar.quizapp.model.Question;
import com.prakhar.quizapp.model.Quiz;
import com.prakhar.quizapp.service.QuestionService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/question")
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/allQuestion")
    public ResponseEntity getAllQuestion(){
        return questionService.getAllQuestion();
    }

    @GetMapping("/category/{category}")
    public ResponseEntity getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }

    @PostMapping("/add")
    public ResponseEntity addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity updateQuestion(@PathVariable(name = "id") int id, Question updatedQues){
        return questionService.updateQuestion(id,updatedQues);
    }

}
