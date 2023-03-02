package com.grechi.systematicreviewreplicationapi.service;

import com.grechi.systematicreviewreplicationapi.dto.ApproachDTO;
import com.grechi.systematicreviewreplicationapi.model.Approach;
import com.grechi.systematicreviewreplicationapi.model.Tool;
import com.grechi.systematicreviewreplicationapi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ApproachService {

    private final ToolService toolService;
    private final LifeCyclePhaseRepository lifeCyclePhaseRepository;
    private final RiskActivityRepository riskActivityRepository;

    private final ModelTypeRepository modelTypeRepository;

    private final ModelingMethodRepository modelingMethodRepository;

    private final ApproachTypeRepository approachTypeRepository;

    private final GoalRepository goalRepository;

    private final EvaluationRepository evaluationRepository;

    private final MeasurementRepository measurementRepository;
    private final ApproachRepository approachRepository;

    @Autowired
    public ApproachService(ToolService toolService, LifeCyclePhaseRepository lifeCyclePhaseRepository, RiskActivityRepository riskActivityRepository,
                           ModelTypeRepository modelTypeRepository, ModelingMethodRepository modelingMethodRepository, ApproachTypeRepository approachTypeRepository,
                           GoalRepository goalRepository, EvaluationRepository evaluationRepository, MeasurementRepository measurementRepository,
                           ApproachRepository approachRepository) {
        this.toolService = toolService;
        this.lifeCyclePhaseRepository = lifeCyclePhaseRepository;
        this.riskActivityRepository = riskActivityRepository;
        this.modelTypeRepository = modelTypeRepository;
        this.modelingMethodRepository = modelingMethodRepository;
        this.approachTypeRepository = approachTypeRepository;
        this.goalRepository = goalRepository;
        this.evaluationRepository = evaluationRepository;
        this.measurementRepository = measurementRepository;
        this.approachRepository = approachRepository;
    }

    public Approach save(ApproachDTO approachDTO){
        Approach approach = new Approach();
        approach.setName(approachDTO.getName());
        approach.setDescription(approachDTO.getDescription());
        approach.setApplicationDomain(approachDTO.getApplicationDomain());

        approachDTO.getTools().forEach(t -> {
            Tool savedTool = toolService.save(t);
            approach.getTools().add(savedTool);
        });

        approach.setLifeCyclePhases(new ArrayList<>());
        approachDTO.getLifeCyclePhases().forEach(lcp -> {
            lifeCyclePhaseRepository.findById(lcp)
                    .ifPresent(record -> {
                        approach.getLifeCyclePhases().add(record);
                    });
        });

        approach.setRiskActivities(new ArrayList<>());
        approachDTO.getRiskActivities().forEach(ra -> {
            riskActivityRepository.findById(ra)
                    .ifPresent(record -> {
                        approach.getRiskActivities().add(record);
                    });
        });

        modelTypeRepository.findById(approachDTO.getModelType())
                .ifPresent(approach::setModelType);

        modelingMethodRepository.findById(approachDTO.getModelingMethod())
                .ifPresent(approach::setModelingMethod);

        approachTypeRepository.findById(approachDTO.getApproachType())
                .ifPresent(approach::setApproachType);

        goalRepository.findById(approachDTO.getGoal())
                .ifPresent(approach::setGoal);

        evaluationRepository.findById(approachDTO.getEvaluation())
                .ifPresent(approach::setEvaluation);

        measurementRepository.findById(approachDTO.getMeasurement())
                .ifPresent(approach::setMeasurement);

        return approachRepository.save(approach);
    }
}
