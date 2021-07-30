package com.example.mongoTest.Services;

import com.example.mongoTest.Repositories.StudentRepository;
import com.example.mongoTest.Entities.TestCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public List<TestCase> getAllStudents() {
        return studentRepository.findAll();
    }
}
