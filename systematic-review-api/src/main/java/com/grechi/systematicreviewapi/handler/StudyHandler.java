package com.grechi.systematicreviewapi.handler;

import com.grechi.systematicreviewapi.model.Study;
import com.grechi.systematicreviewapi.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;


import javax.validation.Valid;

import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class StudyHandler {

    @Autowired
    private StudyService studyService;

    public Mono<ServerResponse> save(@Valid ServerRequest request){
        Mono<Study> study = request.bodyToMono(Study.class);
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(fromPublisher(study.flatMap(studyService::save), Study.class));
    }

    public Mono<ServerResponse> getAll(ServerRequest request){
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.empty(), Study.class);
    }
}
