package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewcore.enums.RiskActivityEnum;
import com.grechi.systematicreviewreplicationapi.model.RiskActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiskActivityRepository extends JpaRepository<RiskActivity, RiskActivityEnum> {
}
