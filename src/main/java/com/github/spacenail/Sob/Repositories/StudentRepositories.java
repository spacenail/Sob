package com.github.spacenail.Sob.Repositories;

import com.github.spacenail.Sob.Entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositories extends CrudRepository<Student,Long> {
}
