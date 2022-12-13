package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewreplicationapi.model.Contribution;
import com.grechi.systematicreviewreplicationapi.model.ContributionEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContributionRepository extends JpaRepository<Contribution, ContributionEnum> {
}
