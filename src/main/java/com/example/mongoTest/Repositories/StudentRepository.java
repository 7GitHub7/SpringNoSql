package com.example.mongoTest.Repositories;

import com.example.mongoTest.Entities.TestCase;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface StudentRepository extends MongoRepository<TestCase,String> {
    Optional<TestCase> findStudentByEmail(String email);

//    @Query("")
//    void test();
}
