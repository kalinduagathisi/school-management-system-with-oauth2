package com.example.service;


import com.example.dto.StudentDto;
import com.example.dto.requestDto.AddStudentRequestDto;
import com.example.dto.requestDto.UpdateStudentRequestDto;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    Boolean addStudent(AddStudentRequestDto addStudentRequestDto);
    Boolean updateStudent(UpdateStudentRequestDto updateStudentRequestDto);
    StudentDto getStudentByEmail(String email);

}