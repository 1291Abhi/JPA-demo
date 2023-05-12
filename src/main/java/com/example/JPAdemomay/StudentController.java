package com.example.JPAdemomay;

import org.hibernate.Remove;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam int id){
        return studentService.deleteStudent(id);
    }
}
