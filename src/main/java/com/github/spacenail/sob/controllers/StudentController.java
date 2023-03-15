package com.github.spacenail.sob.controllers;

import com.github.spacenail.sob.entity.Student;
import com.github.spacenail.sob.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class StudentController {
    private StudentService studentService;

    @Autowired
    private void SetStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @DeleteMapping()
    public void deleteStudent(@RequestBody Student student){
        System.out.println(student);
        studentService.deleteStudent(student);
    }
    @PutMapping
    public void putStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

}
