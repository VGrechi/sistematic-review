package com.grechi.systematicreviewreplicationapi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Approach {

    public List<Tool> getTools() {
        if(tools == null) tools = new ArrayList<>();
        return tools;
    }

    @Id @GeneratedValue
    private Integer approachId;

    @OneToOne(mappedBy = "approach")
    private Study study;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String applicationDomain;

    @ManyToMany
    private List<LifeCyclePhase> lifeCyclePhases;

    @ManyToMany
    private List<RiskActivity> riskActivities;

    @ManyToMany
    private List<Tool> tools;

    @ManyToOne
    @JoinColumn(name = "modelType")
    private ModelType modelType;

    @ManyToOne
    @JoinColumn(name = "modelingMethod")
    private ModelingMethod modelingMethod;

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
