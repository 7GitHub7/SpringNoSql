package com.example.mongoTest.Controllers;

import com.example.mongoTest.Services.StudentService;
import com.example.mongoTest.Entities.TestCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<TestCase> fetchAllStudents(){
       return studentService.getAllStudents();
    }
}