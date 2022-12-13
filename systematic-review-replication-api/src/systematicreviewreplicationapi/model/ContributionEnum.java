package com.grechi.systematicreviewreplicationapi.model;

import lombok.Data;

public enum ContributionEnum {

    APPROACH("APPROACH"),
    METHOD("METHOD"),
    FRAMEWORK("FRAMEWORK"),
    LANGUAGE("LANGUAGE"),
    TOOL("TOOL"),
    PATTERN("PATTERN"),
    COMPARATIVE_STUDY("COMPARATIVE_STUDY"),
    EMPIRICAL_STUDY("EMPIRICAL_STUDY");

    private String name;

    ContributionEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
