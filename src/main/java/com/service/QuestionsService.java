package com.service;


import com.domain.Questions;
import com.repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class QuestionsService {

    @Autowired
    private QuestionsRepository questionsRepository;

    public List<Questions> getQuestions() {
        List<Questions> result = new ArrayList<>();
        Iterable<Questions> iterable =  questionsRepository.findAll();
        iterable.forEach(e-> result.add(e));
        return result;
    }

    public List<Questions> getQuestionsByCategory(String category) {
        List<Questions> result = new ArrayList<>();
        Iterable<Questions> iterable =  questionsRepository.findAllByCategory(category);
        iterable.forEach(e-> result.add(e));
        return result;
    }

}
