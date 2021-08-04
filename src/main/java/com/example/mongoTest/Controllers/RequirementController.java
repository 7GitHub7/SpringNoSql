package com.example.mongoTest.Controllers;

import com.example.mongoTest.Entities.Requirement;
import com.example.mongoTest.Entities.TestCase;
import com.example.mongoTest.Services.RequirementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class RequirementController {

    private final RequirementService requirementService;

    @GetMapping
    public List<Requirement> fetchAllRequirements(){
       return requirementService.getAllRequirements();
    }
    @GetMapping(path = "{email}")
    public Optional<TestCase> findRequirementByEmail(@PathVariable String email ){
        return requirementService.getRequirementByEmail(email);
    }

    @PostMapping
    void addNewRequirement(@RequestBody Requirement requirement ){
        requirementService.addRequirement(requirement);
    }
}
