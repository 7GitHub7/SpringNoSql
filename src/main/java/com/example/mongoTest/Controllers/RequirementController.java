package com.example.mongoTest.Controllers;

import com.example.mongoTest.Entities.Requirement;
import com.example.mongoTest.Entities.TestCase;
import com.example.mongoTest.Services.RequirementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/requirements")
@AllArgsConstructor
public class RequirementController {

    private final RequirementService requirementService;

    @GetMapping
    public List<Requirement> fetchAllRequirements(){
       return requirementService.getAllRequirements();
    }
//    @GetMapping(path = "{email}")
////    public Optional<Requirement> findRequirementByEmail(@PathVariable String email ){
////        return requirementService.getRequirementByEmail(email);
////    }

    @GetMapping(path = "{id}")
    public Optional<Requirement> findRequirementById(@PathVariable String id){
        return requirementService.getRequirementById(id);
    }

    @PostMapping
    void addNewRequirement(@RequestBody Requirement requirement ){
        requirementService.addRequirement(requirement);
    }

}
