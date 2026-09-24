package com.example;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DashboardController {

    private final BuildRecordRepository repository;

    public DashboardController(BuildRecordRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/status")
    public String status() {
        return "Application is running successfully!";
    }

    @GetMapping("/api/build")
    public List<BuildRecord> getBuilds() {
        return repository.findAll();
    }

    @PostMapping("/api/build")
    public BuildRecord createBuild(@RequestBody BuildRecord buildRecord) {
        return repository.save(buildRecord);
    }
}