package com.tiger.medicaltestserver.dao;

import com.tiger.medicaltestserver.model.Question;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface QuestionCrudRepository extends MongoRepository<Question, String> {

    @Override
    Question save(Question question);

    @Override
    List<Question> findAll();

    @Override
    <S extends Question> Optional<S> findOne(Example<S> example);
}
