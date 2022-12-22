package com.grechi.systematicreviewreplicationapi.model;

import com.grechi.systematicreviewcore.enums.ModelTypeEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class ModelType {

    @Id
    @Enumerated(EnumType.STRING)
    public ModelTypeEnum name;

}
