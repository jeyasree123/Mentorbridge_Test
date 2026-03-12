package com.librarymanagement.librarymanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="libraryManagement")
public class LibraryEntity {
    @Id
    private int bookId;
    private String bookName;
    private String author;
    private String publishedYear;

}
