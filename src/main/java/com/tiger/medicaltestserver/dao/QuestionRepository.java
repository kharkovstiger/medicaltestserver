package com.tiger.medicaltestserver.dao;

import com.tiger.medicaltestserver.model.Question;

import java.util.List;

public interface QuestionRepository {
    Question saveQuestion(Question question);

    List<Question> findAll();
}
