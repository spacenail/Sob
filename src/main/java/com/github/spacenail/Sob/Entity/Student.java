package com.github.spacenail.Sob.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    private Long id;
    private String name;
    private Integer age;
}
