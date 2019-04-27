package com.tiger.medicaltestserver.dao;

import com.tiger.medicaltestserver.model.Question;

public interface QuestionRepository {
    Question saveQuestion(Question question);
}
