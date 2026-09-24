package com.example;

import jakarta.persistence.*;

@Entity
@Table(name = "build_records")
public class BuildRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String buildNumber;

    private String branch;

    private String status;

    private String buildTime;

    public BuildRecord() {
    }

    public BuildRecord(String buildNumber, String branch,
                       String status, String buildTime) {
        this.buildNumber = buildNumber;
        this.branch = branch;
        this.status = status;
        this.buildTime = buildTime;
    }

    public Long getId() {
        return id;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }
}