package com.librarymanagement.librarymanagement.repository;

import com.librarymanagement.librarymanagement.entity.LibraryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryEntity,Integer> {
}
