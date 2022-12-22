package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewcore.enums.ContributionEnum;
import com.grechi.systematicreviewreplicationapi.model.Contribution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContributionRepository extends JpaRepository<Contribution, ContributionEnum> {
}
