package com.yamandeep.college_student_api.conbtroller;

import com.yamandeep.college_student_api.model.Student;
import com.yamandeep.college_student_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

//add student end point
    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return new ResponseEntity<>(student, HttpStatus.OK);

    }

    //get student end point
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> allStudents = studentService.getAllStudent();
        return new ResponseEntity<>(allStudents, HttpStatus.FOUND);
    }

//    get student by id
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        Student student = studentService.getStudentById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        return new ResponseEntity<>(student, HttpStatus.FOUND);
    }

}
