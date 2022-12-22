package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewcore.enums.GoalEnum;
import com.grechi.systematicreviewreplicationapi.model.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<Goal, GoalEnum> {
}
