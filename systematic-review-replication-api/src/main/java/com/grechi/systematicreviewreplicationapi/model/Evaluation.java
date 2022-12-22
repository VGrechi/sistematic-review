package com.grechi.systematicreviewreplicationapi.model;

import com.grechi.systematicreviewcore.enums.EvaluationEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Evaluation {

    @Id
    @Enumerated(EnumType.STRING)
    public EvaluationEnum name;

}
