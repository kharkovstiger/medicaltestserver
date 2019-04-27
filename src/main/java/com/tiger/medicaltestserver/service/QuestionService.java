package com.tiger.medicaltestserver.service;

import com.tiger.medicaltestserver.model.Question;

import java.util.List;

public interface QuestionService {
    Question addQuestion(Question question);

    List<Question> getAllQuestions(Integer length);
}
