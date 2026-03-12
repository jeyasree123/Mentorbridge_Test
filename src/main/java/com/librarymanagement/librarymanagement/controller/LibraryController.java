package com.librarymanagement.librarymanagement.controller;

import com.librarymanagement.librarymanagement.dto.LibraryDto;
import com.librarymanagement.librarymanagement.entity.LibraryEntity;
import com.librarymanagement.librarymanagement.service.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class LibraryController {
    private final LibraryService libraryService;

    @PostMapping("/add")
    public String addBook(@RequestBody LibraryDto libraryDto){
        libraryService.addBook(libraryDto);
        return "Book is added to the library";
    }

    @GetMapping("/get")
    public List<LibraryEntity> getAllBooks(@RequestParam int pageNo, @RequestParam int pageSize)
    {
        return libraryService.getAllBooks(PageRequest.of(pageNo-1,pageSize));
    }
}
