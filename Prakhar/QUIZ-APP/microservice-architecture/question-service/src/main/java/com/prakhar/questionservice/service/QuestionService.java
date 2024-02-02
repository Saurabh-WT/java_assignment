package com.prakhar.questionservice.service;

import com.prakhar.questionservice.model.Question;
import com.prakhar.questionservice.model.QuestionWrapper;
import com.prakhar.questionservice.model.Response;
import com.prakhar.questionservice.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public ResponseEntity<List<Integer>> getQuestionForQuiz(String categoryName, Integer numberQues) {
        List<Integer> questNums = questionRepository.getRandomQuestionByCategory(categoryName,numberQues);

        return ResponseEntity.ok(questNums);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuestionFromId(List<Integer> questionIds) {
        List<QuestionWrapper> quesWrapperList = new ArrayList<>();

        for(Integer id: questionIds){
            Question q = questionRepository.findById(id).get();

            QuestionWrapper qw= QuestionWrapper
                    .builder()
                    .id(q.getId())
                    .questionTitle(q.getQuestionTitle())
                    .option1(q.getOption1())
                    .option2(q.getOption2())
                    .option3(q.getOption3())
                    .option4(q.getOption4())
                    .build();

            quesWrapperList.add(qw);
        }

        return ResponseEntity.ok(quesWrapperList);
    }

    public ResponseEntity<Integer> getScore(List<Response> responses) {

        int right = 0;

        for(Response response : responses){
            Question question = questionRepository.findById(response.getId()).get();
            if(response.getResponse().equals(question.getRightAnswer()))
                right++;

        }
        return ResponseEntity.ok(right);

    }
}
