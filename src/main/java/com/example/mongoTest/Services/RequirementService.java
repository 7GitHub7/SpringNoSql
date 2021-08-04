package com.example.mongoTest.Services;

import com.example.mongoTest.Entities.Requirement;
import com.example.mongoTest.Entities.TestCase;
import com.example.mongoTest.Repositories.RequirementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class RequirementService {

    private final RequirementRepository requirementRepository;

    public List<Requirement> getAllRequirements() {
        return requirementRepository.findAll();
    }

    public Optional<TestCase> getRequirementByEmail(String email) {
        return requirementRepository.findRequirementByEmail(email);
    }

    public void addRequirement(Requirement requirement) {
        if (!requirement.getId().isEmpty()) {
            requirement.setId(null);
        }
        requirementRepository.save(requirement);
    }
}
