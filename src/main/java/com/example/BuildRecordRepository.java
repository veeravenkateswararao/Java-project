package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildRecordRepository
        extends JpaRepository<BuildRecord, Long> {
}