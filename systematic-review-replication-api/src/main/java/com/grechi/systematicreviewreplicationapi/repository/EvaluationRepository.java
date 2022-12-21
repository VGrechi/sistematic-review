package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewreplicationapi.model.Evaluation;
import com.grechi.systematicreviewreplicationapi.model.EvaluationEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationRepository extends JpaRepository<Evaluation, EvaluationEnum> {
}
