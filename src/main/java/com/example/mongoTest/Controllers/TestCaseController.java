package com.example.mongoTest.Controllers;

import com.example.mongoTest.Services.TestCaseService;
import com.example.mongoTest.Entities.TestCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/testcase")
@AllArgsConstructor
public class TestCaseController {

    private final TestCaseService testCaseService;

    @GetMapping
    public List<TestCase> fetchAllTestCases(){
        return testCaseService.getAllTestCases();
    }
}
