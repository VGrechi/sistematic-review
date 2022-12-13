package com.grechi.systematicreviewreplicationapi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Author {

    @Id
    @GeneratedValue
    private Integer authorId;

    @Column
    private String name;

    @ManyToMany(mappedBy = "authors")
    private List<Study> studies;
}
