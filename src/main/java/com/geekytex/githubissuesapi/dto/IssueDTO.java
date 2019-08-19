package com.geekytex.githubissuesapi.dto;

import lombok.Data;

@Data
public class IssueDTO {

    private Integer id;
    private String state;
    private String title;
    private String repository;
    private String creationTime;
}
