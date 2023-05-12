package com.example.JPAdemomay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public String addStudent(Student student) {
        studentRepository.save(student);
        return "Student added successfully";
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }

    public String deleteStudent(int id) {
        studentRepository.deleteById(id);
        return "Delete successfully";
    }
}
