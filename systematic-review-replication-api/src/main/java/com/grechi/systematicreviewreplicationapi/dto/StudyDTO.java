package com.grechi.systematicreviewreplicationapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.grechi.systematicreviewcore.enums.ContributionEnum;
import com.grechi.systematicreviewreplicationapi.model.Author;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudyDTO {

    private Integer studyId;

    private String title;

    private List<Author> authors;

    private Integer year;

    private Integer citationIndex;

    private List<String> standards;

    private ContributionEnum contribution;

    private String caseStudy;

    @JsonProperty
    private ApproachDTO approach;
}
