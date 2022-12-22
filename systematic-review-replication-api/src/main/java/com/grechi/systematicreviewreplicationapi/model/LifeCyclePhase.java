package com.grechi.systematicreviewreplicationapi.model;

import com.grechi.systematicreviewcore.enums.LifeCyclePhaseEnum;

import javax.persistence.*;
import java.util.List;

@Entity
public class LifeCyclePhase {

    @Id
    @Enumerated(EnumType.STRING)
    private LifeCyclePhaseEnum name;

    @ManyToMany(mappedBy = "lifeCyclePhases")
    private List<Approach> approaches;

}
