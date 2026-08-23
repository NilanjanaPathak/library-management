package com.nilanjana.library_management.dto;

import java.util.List;

public record StudentData(
        Long studentId,
        String studentName,
        List<Books> books
) {
}
