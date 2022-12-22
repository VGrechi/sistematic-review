package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewcore.enums.ModelingMethodEnum;
import com.grechi.systematicreviewreplicationapi.model.ModelingMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelingMethodRepository extends JpaRepository<ModelingMethod, ModelingMethodEnum> {
}
