package com.grechi.systematicreviewreplicationapi.service;

import com.grechi.systematicreviewreplicationapi.dto.ApproachDTO;
import com.grechi.systematicreviewreplicationapi.dto.ToolDTO;
import com.grechi.systematicreviewreplicationapi.model.Approach;
import com.grechi.systematicreviewreplicationapi.model.Tool;
import com.grechi.systematicreviewreplicationapi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ToolService {

    private final DisciplineRepository disciplineRepository;

    private final MentionTypeRepository mentionTypeRepository;

    private final ToolRepository toolRepository;

    @Autowired
    public ToolService(DisciplineRepository disciplineRepository, MentionTypeRepository mentionTypeRepository, ToolRepository toolRepository) {
        this.disciplineRepository = disciplineRepository;
        this.mentionTypeRepository = mentionTypeRepository;
        this.toolRepository = toolRepository;
    }

    public Tool save(ToolDTO toolDTO){
        Tool tool = new Tool();
        tool.setName(toolDTO.getName());
        tool.setDescription(toolDTO.getDescription());
        tool.setUrl(toolDTO.getUrl());

        disciplineRepository.findById(toolDTO.getDiscipline())
                .ifPresent(tool::setDiscipline);

        mentionTypeRepository.findById(toolDTO.getMentionType())
                .ifPresent(tool::setMentionType);

        return toolRepository.save(tool);
    }
}
