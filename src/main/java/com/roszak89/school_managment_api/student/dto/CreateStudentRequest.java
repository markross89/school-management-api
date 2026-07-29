package com.roszak89.school_managment_api.student.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateStudentRequest {

    private String firstName;
    private String lastName;
    private String email;
    private Long classId;

}
