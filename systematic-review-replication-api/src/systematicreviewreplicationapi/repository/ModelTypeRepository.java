package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewreplicationapi.model.ModelType;
import com.grechi.systematicreviewreplicationapi.model.ModelTypeEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelTypeRepository extends JpaRepository<ModelType, ModelTypeEnum> {
}
