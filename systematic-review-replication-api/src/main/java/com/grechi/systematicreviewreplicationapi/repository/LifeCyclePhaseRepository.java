package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewcore.enums.LifeCyclePhaseEnum;
import com.grechi.systematicreviewreplicationapi.model.LifeCyclePhase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LifeCyclePhaseRepository extends JpaRepository<LifeCyclePhase, LifeCyclePhaseEnum> {
}
