package com.example.mongoTest.Repositories;

import com.example.mongoTest.Entities.Requirement;
import com.example.mongoTest.Entities.TestCase;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RequirementRepository extends MongoRepository<Requirement,String> {
    Optional<TestCase> findStudentByEmail(String email);

//    @Query("")
//    void test();
}
