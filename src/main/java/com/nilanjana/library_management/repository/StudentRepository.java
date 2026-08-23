package com.nilanjana.library_management.repository;

import com.nilanjana.library_management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
