package com.grechi.systematicreviewreplicationapi.model;

import com.grechi.systematicreviewcore.enums.GoalEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Goal {

    @Id
    @Enumerated(EnumType.STRING)
    public GoalEnum name;

}
