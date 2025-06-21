package com.yamandeep.college_student_api.repository;

import com.yamandeep.college_student_api.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository< Student, Long> {

}
