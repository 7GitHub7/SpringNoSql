package com.example.mongoTest.Services;

import com.example.mongoTest.Entities.TestCase;
import com.example.mongoTest.Repositories.TestCaseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class TestCaseService {

    private final TestCaseRepository testCaseRepository;

    public List<TestCase> getAllTestCases() {
        return testCaseRepository.findAll();
    }

    public Optional<TestCase> getTestCaseByEmail(String email) {
        return testCaseRepository.findTestCaseByEmail(email);
    }

    public void addTestCase(TestCase testCase) {
        if (!testCase.getId().isEmpty()) {
            testCase.setId(null);
        }
        testCaseRepository.save(testCase);
    }
}