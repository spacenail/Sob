package com.github.spacenail.sob.services;

import com.github.spacenail.sob.entity.Student;
import com.github.spacenail.sob.repositories.StudentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepositories studentRepositories;

    @Autowired
    private void SetStudentRepositories(StudentRepositories studentRepositories){
        this.studentRepositories = studentRepositories;
    }

    public List<Student> getStudents(){
        return studentRepositories.findAll();
    }

    public void addStudent(Student student) {
        studentRepositories.save(student);
    }

    public void deleteStudent(Student student) {
        studentRepositories.delete(student);
    }
    
    public void updateStudent(Student newStudent){
        Optional<Student> student = studentRepositories.findById(newStudent.getId());
        if(student.isPresent()){
            addStudent(newStudent);
        }else{
            throw new RuntimeException("User not found");
        }
    }
}
