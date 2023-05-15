package com.example.JPAdemomay;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByAge(int age);
    List<Student> findByAgeAndMarks(int age, int marks);
}
