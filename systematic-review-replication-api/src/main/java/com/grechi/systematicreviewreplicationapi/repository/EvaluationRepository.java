package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewcore.enums.EvaluationEnum;
import com.grechi.systematicreviewreplicationapi.model.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationRepository extends JpaRepository<Evaluation, EvaluationEnum> {
}
