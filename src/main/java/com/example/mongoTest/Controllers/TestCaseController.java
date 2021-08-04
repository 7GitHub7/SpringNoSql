package com.example.mongoTest.Controllers;

import com.example.mongoTest.Services.TestCaseService;
import com.example.mongoTest.Entities.TestCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/testcase")
@AllArgsConstructor
public class TestCaseController {

    private final TestCaseService testCaseService;

    @GetMapping
    public List<TestCase> fetchAllTestCases(){
        return testCaseService.getAllTestCases();
    }

    @GetMapping(path = "{email}")
    public Optional<TestCase> findRequirementByEmail(@PathVariable String email ){
        return testCaseService.getTestCaseByEmail(email);
    }

    @PostMapping
    void addNewTestCase(@RequestBody TestCase testCase ){
        testCaseService.addTestCase(testCase);
    }
}
