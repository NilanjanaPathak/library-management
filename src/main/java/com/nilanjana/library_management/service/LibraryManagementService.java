package com.nilanjana.library_management.service;

import com.nilanjana.library_management.dto.StudentData;
import com.nilanjana.library_management.dto.SuccessResponse;
import com.nilanjana.library_management.entity.Student;
import com.nilanjana.library_management.mapper.StudentMapper;
import com.nilanjana.library_management.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LibraryManagementService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    public LibraryManagementService(StudentRepository studentRepository,StudentMapper studentMapper) {
        this.studentRepository= studentRepository;
        this.studentMapper= studentMapper;
    }

    public StudentData getStudentBooks(Long studentId) {

        return new StudentData(studentId,"Arka",new ArrayList<>());
    }

    public SuccessResponse addNewStudent(StudentData studentData) {
        Student student = studentMapper.toStudent(studentData);
        studentRepository.save(student);
        return new SuccessResponse("Success","Book Issued");
    }
}
