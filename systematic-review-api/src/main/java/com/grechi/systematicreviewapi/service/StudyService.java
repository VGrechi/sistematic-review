package com.grechi.systematicreviewapi.service;

import com.grechi.systematicreviewapi.model.Study;
import com.grechi.systematicreviewapi.controller.producer.StudyProducer;
import com.grechi.systematicreviewapi.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class StudyService {

    @Autowired
    private StudyRepository studyNoSQLRepository;

    @Autowired
    private StudyProducer studyProducer;

    public Mono<Study> save(Study study){
        Mono<Study> savedStudy = studyNoSQLRepository.save(study);

        savedStudy.subscribe(s -> studyProducer.sendMessage(s));

        return savedStudy;
    }
}
