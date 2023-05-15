package com.example.JPAdemomay;

import org.hibernate.Remove;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/get_by_age")
    public List<String> getAllByAge(@RequestParam int age){
        return studentService.getAllByAge(age);
    }
    @GetMapping("/get_by_age_marks")
    public List<String> getAllByAgeMarks(@RequestParam int age,@RequestParam int marks){
        return studentService.getAllByAgeMarks(age,marks);
    }

    @GetMapping("/get_by_age_greater_than")
    public List<String> getAllByAgeGreaterThan(@RequestParam int age){
        return studentService.getAllByAgeGreaterThan(age);
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam int id){
        return studentService.deleteStudent(id);
    }
}
