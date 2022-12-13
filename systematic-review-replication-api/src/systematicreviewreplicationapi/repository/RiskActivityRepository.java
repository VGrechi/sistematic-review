package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewreplicationapi.model.RiskActivity;
import com.grechi.systematicreviewreplicationapi.model.RiskActivityEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiskActivityRepository extends JpaRepository<RiskActivity, RiskActivityEnum> {
}
