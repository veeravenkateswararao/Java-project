#!/bin/bash
set -exo pipefail

# Update system packages
sudo dnf update -y

# Install Java 21 and fontconfig
sudo dnf install java-21-amazon-corretto fontconfig -y

# Verify Java
java -version

# Add Jenkins LTS repository
sudo wget -O /etc/yum.repos.d/jenkins.repo \
    https://pkg.jenkins.io/rpm-stable/jenkins.repo

# Import Jenkins signing key
sudo rpm --import \
    https://pkg.jenkins.io/rpm-stable/jenkins.io-2026.key

# Install Jenkins
sudo dnf install jenkins -y

# Reload systemd
sudo systemctl daemon-reload

# Enable Jenkins at boot
sudo systemctl enable jenkins

# Start Jenkins
sudo systemctl start jenkins

# Check Jenkins status
sudo systemctl status jenkins --no-pager