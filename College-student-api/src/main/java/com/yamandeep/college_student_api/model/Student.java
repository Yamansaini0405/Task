package com.yamandeep.college_student_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Column(nullable = false)
    private String email;

    private String course;

    private int year;

}
