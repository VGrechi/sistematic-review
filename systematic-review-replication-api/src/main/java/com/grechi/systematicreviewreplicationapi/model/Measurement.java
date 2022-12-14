package com.grechi.systematicreviewreplicationapi.model;

import com.grechi.systematicreviewcore.enums.MeasurementEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Measurement {

    @Id
    @Enumerated(EnumType.STRING)
    public MeasurementEnum name;

}
