package com.example.mongoTest.Entities;

import com.example.mongoTest.ReviewStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.LocalDateTime;

public class Requirement {
    @Id
    private String id;
    private String description;
    private String createdBy;
    @Indexed(unique = true)
    private String email;
    private String requirementDescription;
    private LocalDateTime created;
    private com.example.mongoTest.ReviewStatus ReviewStatus;
    private String Comment;

    public Requirement(String description, String createdBy, String email, String requirementDescription, LocalDateTime created, com.example.mongoTest.ReviewStatus reviewStatus, String comment) {
        this.description = description;
        this.createdBy = createdBy;
        this.email = email;
        this.requirementDescription = requirementDescription;
        this.created = created;
        ReviewStatus = reviewStatus;
        Comment = comment;
    }
}
