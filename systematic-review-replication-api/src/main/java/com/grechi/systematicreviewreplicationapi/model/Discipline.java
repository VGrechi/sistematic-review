package com.grechi.systematicreviewreplicationapi.model;

import com.grechi.systematicreviewcore.enums.DisciplineEnum;
import com.grechi.systematicreviewcore.enums.ModelingMethodEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Discipline {

    @Id
    @Enumerated(EnumType.STRING)
    public DisciplineEnum name;

}
