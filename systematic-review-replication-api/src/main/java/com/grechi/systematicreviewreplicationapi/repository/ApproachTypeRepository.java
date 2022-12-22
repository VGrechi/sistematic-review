package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewcore.enums.ApproachTypeEnum;
import com.grechi.systematicreviewreplicationapi.model.ApproachType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApproachTypeRepository extends JpaRepository<ApproachType, ApproachTypeEnum> {
}
