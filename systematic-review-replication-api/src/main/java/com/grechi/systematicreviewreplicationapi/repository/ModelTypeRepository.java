package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewcore.enums.ModelTypeEnum;
import com.grechi.systematicreviewreplicationapi.model.ModelType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelTypeRepository extends JpaRepository<ModelType, ModelTypeEnum> {
}
