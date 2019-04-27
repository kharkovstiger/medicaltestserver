package com.tiger.medicaltestserver.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Question {
    @Id
    private String id;
    private String question;
    private List<Answer> answers;
}
