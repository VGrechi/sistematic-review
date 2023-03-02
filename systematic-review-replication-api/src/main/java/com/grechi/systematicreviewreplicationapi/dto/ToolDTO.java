package com.grechi.systematicreviewreplicationapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.grechi.systematicreviewcore.enums.*;
import com.grechi.systematicreviewreplicationapi.model.Tool;
import lombok.Data;

import java.util.List;

@Data
public class ToolDTO {

    @JsonProperty
    private String name;

    @JsonProperty
    private DisciplineEnum discipline;

    @JsonProperty
    private String description;

    @JsonProperty
    private String url;

    @JsonProperty
    private MentionTypeEnum mentionType;

}
