package com.tiger.medicaltestserver.controller;

import com.tiger.medicaltestserver.model.Question;
import com.tiger.medicaltestserver.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = QuestionController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class QuestionController {

    static final String REST_URL = "/api";

    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping(value = "/add")
    public ResponseEntity addQuestion(@RequestBody Question question){
        return new ResponseEntity(questionService.addQuestion(question), HttpStatus.OK);
    }

    @GetMapping(value = "/get")
    public ResponseEntity getAllQuestions(@RequestParam(required = false) Integer length){
        return new ResponseEntity(questionService.getAllQuestions(length), HttpStatus.OK);
    }
}
