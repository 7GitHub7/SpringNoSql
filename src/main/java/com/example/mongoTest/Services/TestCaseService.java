package com.example.mongoTest.Services;

import com.example.mongoTest.Entities.TestCase;
import com.example.mongoTest.Repositories.TestCaseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class TestCaseService {

    private final TestCaseRepository testCaseRepository;

    public List<TestCase> getAllTestCases() {
        return testCaseRepository.findAll();
    }
}