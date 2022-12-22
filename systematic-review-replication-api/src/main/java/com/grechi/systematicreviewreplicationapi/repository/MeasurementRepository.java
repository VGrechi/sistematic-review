package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewcore.enums.MeasurementEnum;
import com.grechi.systematicreviewreplicationapi.model.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementRepository extends JpaRepository<Measurement, MeasurementEnum> {
}
