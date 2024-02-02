package com.prakhar.questionservice.controller;

import com.prakhar.questionservice.model.Question;
import com.prakhar.questionservice.model.QuestionWrapper;
import com.prakhar.questionservice.model.Response;
import com.prakhar.questionservice.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/generate")
    public ResponseEntity<List<Integer>> getQuestionForQuiz(
            @RequestParam String categoryName,
            @RequestParam Integer numberQues
    ){
        return questionService.getQuestionForQuiz(categoryName,numberQues);
    }

    @PostMapping("/getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionFromId(
            @RequestBody List<Integer> questionIds
    ){
        return questionService.getQuestionFromId(questionIds);
    }

    @PostMapping("/getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses){

        return questionService.getScore(responses);
    }

}
