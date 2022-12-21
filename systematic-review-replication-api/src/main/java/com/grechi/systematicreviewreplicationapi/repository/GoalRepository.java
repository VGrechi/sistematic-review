package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewreplicationapi.model.Goal;
import com.grechi.systematicreviewreplicationapi.model.GoalEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<Goal, GoalEnum> {
}
