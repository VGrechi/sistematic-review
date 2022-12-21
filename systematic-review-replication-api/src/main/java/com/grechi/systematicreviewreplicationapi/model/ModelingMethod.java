package com.grechi.systematicreviewreplicationapi.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class ModelingMethod {

    @Id
    @Enumerated(EnumType.STRING)
    public ModelingMethodEnum name;

}
