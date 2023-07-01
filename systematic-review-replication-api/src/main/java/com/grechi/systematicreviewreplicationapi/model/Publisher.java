package com.grechi.systematicreviewreplicationapi.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Publisher {

    @Id @GeneratedValue
    private Integer publisherId;

    @OneToOne(mappedBy = "publisher")
    private Study study;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "publisherType")
    private PublisherType publisherType;

    @Column
    private String subject;

}
