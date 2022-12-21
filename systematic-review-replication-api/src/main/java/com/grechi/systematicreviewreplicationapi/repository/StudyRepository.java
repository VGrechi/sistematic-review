package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewreplicationapi.model.Study;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyRepository extends JpaRepository<Study, Integer> {
}
