package com.yamandeep.college_student_api.service;

import com.yamandeep.college_student_api.model.Student;
import com.yamandeep.college_student_api.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    //add student service
    public Student addStudent(Student student){
        return studentRepo.save(student);
    }

    //get all student
    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }

    //get student by id
    public Optional<Student> getStudentById(Long id){
        return studentRepo.findById(id);
    }
}
