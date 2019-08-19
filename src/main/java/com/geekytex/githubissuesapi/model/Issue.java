package com.geekytex.githubissuesapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Issue {

    private Integer id;
    private String state;
    private String title;
    private String repository;
    private String creationTime;
}
