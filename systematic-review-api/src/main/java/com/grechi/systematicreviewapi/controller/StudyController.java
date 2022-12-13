package com.grechi.systematicreviewapi.controller;

import com.grechi.systematicreviewapi.model.Study;
import com.grechi.systematicreviewapi.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("studies")
public class StudyController {

    @Autowired
    private StudyService studyService;

    @PostMapping
    @CrossOrigin
    public Mono<Study> postStudy(@Valid @RequestBody Study study){
        return studyService.save(study);
    }
}
