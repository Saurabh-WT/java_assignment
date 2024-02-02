package com.prakhar.quizapp.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
public class QuestionWrapper {

    private int id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

}
