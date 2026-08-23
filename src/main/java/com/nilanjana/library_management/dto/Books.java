package com.nilanjana.library_management.dto;

import java.util.Date;

public record Books(
        Integer bookId,
        String bookName,
        Date issuedDate,
        Date retrunDate
) {
}
