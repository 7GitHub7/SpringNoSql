package com.example.mongoTest.Services;

import com.example.mongoTest.Repositories.RequirementRepository;
import com.example.mongoTest.Entities.Requirement;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class RequirementService {

    private final RequirementRepository requirementRepository;

    public List<Requirement> getAllRequirements() {
        return requirementRepository.findAll();
    }
}
