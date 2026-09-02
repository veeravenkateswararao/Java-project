package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

    @GetMapping("/api/status")
    public String status() {
        return "Application is running successfully!";
    }

    @GetMapping("/api/build")
    public String build() {
        return "Build #128 - SUCCESS";
    }
}
