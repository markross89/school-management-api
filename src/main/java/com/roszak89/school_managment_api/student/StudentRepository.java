package com.roszak89.school_managment_api.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findStudentByEmail(String email);
    boolean existsByEmail(String email);

}
