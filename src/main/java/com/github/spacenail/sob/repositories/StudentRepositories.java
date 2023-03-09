package com.github.spacenail.sob.repositories;

import com.github.spacenail.sob.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepositories extends CrudRepository<Student,Long> {
    List<Student> findAll();
}
