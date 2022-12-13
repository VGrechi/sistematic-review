package com.grechi.systematicreviewapi.router;

import com.grechi.systematicreviewapi.handler.StudyHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;

@Configuration
public class StudyRouter {

   //@Bean
    public RouterFunction<ServerResponse> route(StudyHandler handler){
        return RouterFunctions
                .route(POST("/studies"), handler::save)
                .andRoute(GET("/studies"), handler::getAll);
    }
}
