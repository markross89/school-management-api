package com.roszak89.school_managment_api.student;


//import com.roszak89.school_managment_api.schoolclass.SchoolClass;
//import com.roszak89.school_managment_api.schoolclass.SchoolClassRepository;
import com.roszak89.school_managment_api.student.dto.CreateStudentRequest;
import com.roszak89.school_managment_api.student.dto.StudentResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    //    private final SchoolClassRepository schoolClassRepository;
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Transactional
    public StudentResponseDto createStudent(CreateStudentRequest request) {
        if (studentRepository.existsByEmail(request.getEmail())) {
            throw new IllegalArgumentException("Student with email " + request.getEmail() + " already exists");
        }

        Student student = studentMapper.toEntity(request);

//        if (request.getClassId() != null) {
//            SchoolClass schoolClass = schoolClassRepository.findById(request.getClassId())
//                    .orElseThrow(() -> new IllegalArgumentException("Class not found with id: " + request.getClassId()));
//            student.setSchoolClass(schoolClass);
//        }

        Student savedStudent = studentRepository.save(student);
        return studentMapper.toDto(savedStudent);
    }

    @Transactional(readOnly = true)
    public List<StudentResponseDto> getAllStudents() {
        return studentRepository.findAll().stream()
                .map(studentMapper::toDto)
                .toList();
    }

    @Transactional(readOnly = true)
    public StudentResponseDto getStudentById(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Student not found with id: " + id));
        return studentMapper.toDto(student);
    }
}