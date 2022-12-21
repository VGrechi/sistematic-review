package com.grechi.systematicreviewreplicationapi.repository;

import com.grechi.systematicreviewreplicationapi.model.Measurement;
import com.grechi.systematicreviewreplicationapi.model.MeasurementEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementRepository extends JpaRepository<Measurement, MeasurementEnum> {
}
