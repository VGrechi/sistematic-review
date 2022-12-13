package com.grechi.systematicreviewapi.repository;

import com.grechi.systematicreviewapi.model.Study;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyRepository extends ReactiveMongoRepository<Study, String> {
}
