package com.grechi.systematicreviewapi.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class Approach {

    @NotNull(message = "{validation.study.approach.name}")
    private String name;

    @NotNull(message = "{validation.study.approach.description}")
    private String description;

    @NotNull(message = "{validation.study.approach.applicationDomain}")
    private String applicationDomain;

    @NotNull(message = "{validation.study.approach.lifeCyclePhases}")
    private List<LifeCyclePhaseEnum> lifeCyclePhases;

    @NotNull(message = "{validation.study.approach.riskActivities}")
    private List<RiskActivityEnum> riskActivities;

    @NotNull(message = "{validation.study.approach.tools}")
    private List<String> tools;

    @NotNull(message = "{validation.study.approach.modelType}")
    private ModelTypeEnum modelType;

    @NotNull(message = "{validation.study.approach.modelingMethod}")
    private ModelingMethodEnum modelingMethod;

    @NotNull(message = "{validation.study.approach.evaluation}")
    private EvaluationEnum evaluation;

    @NotNull(message = "{validation.study.approach.approachType}")
    private ApproachTypeEnum approachType;

    @NotNull(message = "{validation.study.approach.goal}")
    private GoalEnum goal;

    @NotNull(message = "{validation.study.approach.measurement}")
    private MeasurementEnum measurement;

}
