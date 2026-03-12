package com.librarymanagement.librarymanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class LibraryDto {
    private int bookId;
    private String bookName;
    private String author;
    private String publishedYear;
}
