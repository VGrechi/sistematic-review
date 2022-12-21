package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewreplicationapi.model.LifeCyclePhase;
import com.grechi.systematicreviewreplicationapi.model.LifeCyclePhaseEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LifeCyclePhaseRepository extends JpaRepository<LifeCyclePhase, LifeCyclePhaseEnum> {
}
