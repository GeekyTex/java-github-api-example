package com.geekytex.githubissuesapi.modelmapper;

import com.geekytex.githubissuesapi.dto.IssueDTO;
import com.geekytex.githubissuesapi.model.Issue;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.modelmapper.ModelMapper;

public class DTOUnitTests {

    private ModelMapper modelMapper = new ModelMapper();

    @Test
    public void map_IssueToIssueDTO_Success() {
        Issue issue = new Issue();
        issue.setId(123);
        issue.setTitle("Issue Title");
        issue.setState("Closed");
        issue.setRepository("user/project1");
        issue.setCreationTime("12345");

        IssueDTO issueDTO = modelMapper.map(issue, IssueDTO.class);

        assertEquals(issueDTO.getId(), issue.getId());
        assertEquals(issueDTO.getTitle(), issue.getTitle());
        assertEquals(issueDTO.getState(), issue.getState());
        assertEquals(issueDTO.getRepository(), issue.getRepository());
        assertEquals(issueDTO.getCreationTime(), issueDTO.getCreationTime());
    }
}
