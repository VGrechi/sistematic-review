package com.grechi.systematicreviewreplicationapi.model;

import com.grechi.systematicreviewcore.enums.RiskActivityEnum;

import javax.persistence.*;
import java.util.List;

@Entity
public class RiskActivity {

    @Id
    @Enumerated(EnumType.STRING)
    public RiskActivityEnum name;

    @ManyToMany(mappedBy = "riskActivities")
    private List<Approach> approaches;

}
