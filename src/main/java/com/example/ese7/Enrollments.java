package com.example.ese7;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table
@Data
@Entity
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany
    private List<Student> students;

    @ManyToOne
    private Class classOne;
}
