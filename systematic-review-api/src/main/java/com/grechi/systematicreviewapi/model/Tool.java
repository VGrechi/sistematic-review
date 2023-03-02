package com.grechi.systematicreviewapi.model;

import com.grechi.systematicreviewcore.enums.DisciplineEnum;
import com.grechi.systematicreviewcore.enums.MentionTypeEnum;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Tool {

    @NotNull(message = "{validation.study.approach.tool.name}")
    private String name;

    @NotNull(message = "{validation.study.approach.tool.discipline}")
    private DisciplineEnum discipline;

    @NotNull(message = "{validation.study.approach.tool.description}")
    private String description;

    private String url;

    @NotNull(message = "{validation.study.approach.tool.mentionType}")
    private MentionTypeEnum mentionType;
}
