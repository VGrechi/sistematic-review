package com.grechi.systematicreviewreplicationapi.model;

import com.grechi.systematicreviewcore.enums.PublisherTypeEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class PublisherType {

    @Id
    @Enumerated(EnumType.STRING)
    public PublisherTypeEnum name;

}
