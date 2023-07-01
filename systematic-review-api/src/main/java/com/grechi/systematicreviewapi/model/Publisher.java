package com.grechi.systematicreviewapi.model;

import com.grechi.systematicreviewcore.enums.PublisherTypeEnum;
import lombok.Data;

@Data
public class Publisher {

    private String name;
    private PublisherTypeEnum publisherType;
    private String subject;

}
