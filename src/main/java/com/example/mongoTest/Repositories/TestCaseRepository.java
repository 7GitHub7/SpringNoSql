package com.example.mongoTest.Repositories;

import com.example.mongoTest.Entities.TestCase;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestCaseRepository extends MongoRepository<TestCase,String> {
}
