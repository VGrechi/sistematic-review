package com.grechi.systematicreviewreplicationapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.grechi.systematicreviewcore.enums.PublisherTypeEnum;
import lombok.Data;

@Data
public class PublisherDTO {

    @JsonProperty
    private String name;

    @JsonProperty
    private PublisherTypeEnum publisherType;

    @JsonProperty
    private String subject;
}
