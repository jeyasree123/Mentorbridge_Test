package com.librarymanagement.librarymanagement.service;

import com.librarymanagement.librarymanagement.dto.LibraryDto;
import com.librarymanagement.librarymanagement.entity.LibraryEntity;
import com.librarymanagement.librarymanagement.repository.LibraryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LibraryService {
    private final LibraryRepository libraryRepository;

    public void addBook(LibraryDto libraryDto) {
        LibraryEntity libraryEntity= LibraryEntity.builder()
                .bookId(libraryDto.getBookId())
                .bookName(libraryDto.getBookName())
                .author(libraryDto.getAuthor())
                .publishedYear(libraryDto.getPublishedYear())
                .build();
        libraryRepository.save(libraryEntity);
    }

    public List<LibraryEntity> getAllBooks(Pageable pageable) {
        return libraryRepository.findAll(pageable).getContent();
    }
}
