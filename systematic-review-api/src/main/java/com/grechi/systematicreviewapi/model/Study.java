package com.grechi.systematicreviewapi.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.List;

@Document(collection = "studies")
@Data
public class Study {

    @Id
    private String id;

    @NotNull(message = "{validation.study.title}")
    private String title;

    @NotNull(message = "{validation.study.authors}")
    private List<Author> authors;

    @NotNull(message = "{validation.study.year}")
    private Integer year;

    @NotNull(message = "{validation.study.citationIndex}")
    private Integer citationIndex;

    @NotNull(message = "{validation.study.standards}")
    private List<String> standards;

    @NotNull(message = "{validation.study.contribution}")
    private ContributionEnum contribution;

    @NotNull(message = "{validation.study.caseStudy}")
    private String caseStudy;

    @NotNull(message = "{validation.study.approach}")
    private Approach approach;

}
