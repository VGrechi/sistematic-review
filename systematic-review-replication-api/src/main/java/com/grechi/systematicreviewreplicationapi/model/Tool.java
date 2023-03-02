package com.grechi.systematicreviewreplicationapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Tool {

    @Id
    @GeneratedValue
    private Integer toolId;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "discipline")
    private Discipline discipline;

    @Column
    private String description;

    @Column
    private String url;

    @ManyToOne
    @JoinColumn(name = "mentionType")
    private MentionType mentionType;

    @ManyToMany(mappedBy = "tools")
    private List<Approach> approaches;
}
