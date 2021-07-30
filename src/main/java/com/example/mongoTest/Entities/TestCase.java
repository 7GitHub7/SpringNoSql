package com.example.mongoTest.Entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class TestCase {
    @Id
    private String id;
    private String description;
    private String createdBy;
    @Indexed(unique = true)
    private String email;
    private String requirementReference;
    private String requirementDescription;
    private LocalDateTime created;

    public TestCase(String description, String createdBy, String email, String requirementReference, String requirementDescription, LocalDateTime created) {
        this.description = description;
        this.createdBy = createdBy;
        this.email = email;
        this.requirementReference = requirementReference;
        this.requirementDescription = requirementDescription;
        this.created = created;
    }

}
