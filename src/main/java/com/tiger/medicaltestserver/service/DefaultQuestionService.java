package com.tiger.medicaltestserver.service;

import com.tiger.medicaltestserver.dao.QuestionRepository;
import com.tiger.medicaltestserver.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DefaultQuestionService implements QuestionService {

    private final QuestionRepository questionRepository;

    @Autowired
    public DefaultQuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question addQuestion(Question question) {
        return questionRepository.saveQuestion(question);
    }

    @Override
    public List<Question> getAllQuestions(Integer length) {
        List<Question> questions = questionRepository.findAll();
        Collections.shuffle(questions);
        return length == null ? questions : questions.subList(0, length-1);
    }
}
