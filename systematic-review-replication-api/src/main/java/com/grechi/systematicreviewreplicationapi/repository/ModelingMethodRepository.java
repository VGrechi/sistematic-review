package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewreplicationapi.model.ModelingMethod;
import com.grechi.systematicreviewreplicationapi.model.ModelingMethodEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelingMethodRepository extends JpaRepository<ModelingMethod, ModelingMethodEnum> {
}
