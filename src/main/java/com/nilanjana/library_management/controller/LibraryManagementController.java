package com.nilanjana.library_management.controller;

import com.nilanjana.library_management.dto.Books;
import com.nilanjana.library_management.dto.StudentData;
import com.nilanjana.library_management.dto.SuccessResponse;
import com.nilanjana.library_management.service.LibraryManagementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class LibraryManagementController {
    private final LibraryManagementService libraryManagementService;
    public LibraryManagementController(LibraryManagementService libraryManagementService) {
        this.libraryManagementService = libraryManagementService;
    }

//    @GetMapping("/student/{studentId}/books")
//    public ResponseEntity<StudentData> getStudentBooks(@PathVariable String studentId) {
//        return new ResponseEntity<>(libraryManagementService.getStudentBooks(studentId), HttpStatus.OK);
//    }

    @PostMapping("/student")
    public ResponseEntity<SuccessResponse> addStudent(@RequestBody StudentData student) {
        return new ResponseEntity<>(libraryManagementService.addNewStudent(student),HttpStatus.CREATED);
    }

    @PostMapping("/student/{studentId}/issueBook")
    public ResponseEntity<SuccessResponse> issueBook(@RequestBody Books books, @PathVariable String studentId) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
