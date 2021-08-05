package com.example.mongoTest.Entities;

import com.example.mongoTest.ReviewStatus;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class Requirement {
    @Id
    @Indexed(unique = true)
    private String id;
    private String description;
    private String createdBy;
    private String email;
    private String requirementDescription;
    private LocalDateTime created;
    private ReviewStatus reviewStatus;
    private List<TestCase> testCaseList;
    private String comment;

    public Requirement(String description, String createdBy, String email, String requirementDescription, LocalDateTime created, ReviewStatus reviewStatus, String comment) {
        this.description = description;
        this.createdBy = createdBy;
        this.email = email;
        this.requirementDescription = requirementDescription;
        this.created = created;
        this.reviewStatus = reviewStatus;
        this.comment = comment;
    }
}
