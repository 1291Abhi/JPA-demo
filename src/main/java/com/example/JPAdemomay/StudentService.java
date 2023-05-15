package com.example.JPAdemomay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    LibraryCardRepository cardRepository;
    public String addStudent(Student student) {
        LibraryCard libraryCard=new LibraryCard();
        libraryCard.setDepartment(student.getDepartment());
        libraryCard.setStudent(student);
        student.setLibraryCard(libraryCard);
        studentRepository.save(student);
//        cardRepository.save(libraryCard);
        return "Student added successfully";
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }

    public String deleteStudent(int id) {
        studentRepository.deleteById(id);
        return "Delete successfully";
    }

    public List<String> getAllByAge(int age) {
        List<Student> students=studentRepository.findByAge(age);
        List<String> names=new ArrayList<>();
        for(Student student:students){
            names.add(student.getName());
        }
        return names;
    }

    public List<String> getAllByAgeMarks(int age, int marks) {
        List<Student> students=studentRepository.findByAgeAndMarks(age,marks);
        List<String> names=new ArrayList<>();
        for(Student student:students){
            names.add(student.getName());
        }
        return names;
    }
}
