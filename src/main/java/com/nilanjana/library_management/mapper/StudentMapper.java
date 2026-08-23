package com.nilanjana.library_management.mapper;

import com.nilanjana.library_management.dto.StudentData;
import com.nilanjana.library_management.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel ="spring")
public interface StudentMapper {

    @Mapping(source= "studentName", target= "studentName")
    //@Mapping(target = "studentId", ignore = true)
    //@Mapping(target = "books", ignore = true)
    Student toStudent(StudentData studentData);

}
