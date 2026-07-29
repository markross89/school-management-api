package com.roszak89.school_managment_api.student;

import com.roszak89.school_managment_api.student.dto.CreateStudentRequest;
import com.roszak89.school_managment_api.student.dto.StudentResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    @Mapping(source = "schoolClass.name", target = "className")
    StudentResponseDto toDto(Student student);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "schoolClass", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    Student toEntity(CreateStudentRequest dto);
}