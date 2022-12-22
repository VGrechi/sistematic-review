package com.grechi.systematicreviewreplicationapi.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Study {

    @Id
    private Integer studyId;

    @Column
    private String title;

    @ManyToMany
    private List<Author> authors;

    @Column
    private Integer year;

    @Column
    private Integer citationIndex;

    @ElementCollection
    @CollectionTable(name = "Standard", joinColumns = @JoinColumn(name = "study_id"))
    private List<String> standards;

    @ManyToOne
    @JoinColumn(name = "contribution")
    private Contribution contribution;

    @Column
    private String caseStudy;

    @OneToOne
    @JoinColumn(name = "approach_id")
    private Approach approach;

}
