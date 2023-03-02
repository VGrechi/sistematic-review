package com.grechi.systematicreviewreplicationapi.model;

import com.grechi.systematicreviewcore.enums.MentionTypeEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class MentionType {

    @Id
    @Enumerated(EnumType.STRING)
    public MentionTypeEnum name;

}
