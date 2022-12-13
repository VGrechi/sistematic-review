package com.grechi.systematicreviewreplicationapi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Approach {

    @Id @GeneratedValue
    private Integer approachId;

    @OneToOne(mappedBy = "approach")
    private Study study;

    @Column
    private String name;

    @Column
    private String description;

    @ManyToMany
    private List<LifeCyclePhase> lifeCyclePhases;

    @ManyToMany
    private List<RiskActivity> riskActivities;

    @ElementCollection
    @CollectionTable(name = "Tool", joinColumns = @JoinColumn(name = "approach_id"))
    private List<String> tools;

    @ManyToOne
    @JoinColumn(name = "modelType")
    private ModelType modelType;

    @ManyToOne
    @JoinColumn(name = "evaluation")
    private Evaluation evaluation;

    @ManyToOne
    @JoinColumn(name = "approachType")
    private ApproachType approachType;

    @ManyToOne
    @JoinColumn(name = "goal")
    private Goal goal;

    @ManyToOne
    @JoinColumn(name = "measurement")
    private Measurement measurement;

}
