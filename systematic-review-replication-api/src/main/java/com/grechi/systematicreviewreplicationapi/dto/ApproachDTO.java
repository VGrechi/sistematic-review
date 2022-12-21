package com.grechi.systematicreviewreplicationapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.grechi.systematicreviewreplicationapi.model.*;
import lombok.Data;

import java.util.List;

@Data
public class ApproachDTO {

    private Integer approachId;

    @JsonProperty
    private String name;

    @JsonProperty
    private String description;

    @JsonProperty
    private String applicationDomain;

    @JsonProperty
    private List<LifeCyclePhaseEnum> lifeCyclePhases;

    @JsonProperty
    private List<RiskActivityEnum> riskActivities;

    @JsonProperty
    private List<String> tools;

    @JsonProperty
    private ModelTypeEnum modelType;

    @JsonProperty
    private ModelingMethodEnum modelingMethod;

    @JsonProperty
    private EvaluationEnum evaluation;

    @JsonProperty
    private ApproachTypeEnum approachType;

    @JsonProperty
    private GoalEnum goal;

    @JsonProperty
    private MeasurementEnum measurement;

}
