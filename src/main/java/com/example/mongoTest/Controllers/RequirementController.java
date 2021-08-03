package com.example.mongoTest.Controllers;

import com.example.mongoTest.Entities.Requirement;
import com.example.mongoTest.Services.RequirementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class RequirementController {

    private final RequirementService requirementService;

    @GetMapping
    public List<Requirement> fetchAllRequirements(){
       return requirementService.getAllRequirements();
    }
}
