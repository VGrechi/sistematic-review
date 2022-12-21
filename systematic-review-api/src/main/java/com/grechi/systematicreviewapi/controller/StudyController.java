package com.grechi.systematicreviewapi.controller;

import com.grechi.systematicreviewapi.model.Study;
import com.grechi.systematicreviewapi.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.util.List;

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

    @PostMapping("/batch")
    @CrossOrigin
    public Mono<Study> postStudyAsBatch(@Valid @RequestBody List<Study> studies){
        studies.forEach(study -> studyService.save(study));
        return Mono.empty();
    }
}
