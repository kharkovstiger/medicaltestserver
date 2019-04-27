package com.tiger.medicaltestserver.dao;

import com.tiger.medicaltestserver.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultQuestionRepository implements QuestionRepository {

    private final QuestionCrudRepository questionCrudRepository;

    @Autowired
    public DefaultQuestionRepository(QuestionCrudRepository questionCrudRepository) {
        this.questionCrudRepository = questionCrudRepository;
    }

    @Override
    public Question saveQuestion(Question question) {
        return questionCrudRepository.save(question);
    }
}
