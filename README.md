# ReportsMicroService
[![Java](https://img.shields.io/badge/java-21-blue)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/spring%20boot-3.2.4-green)](https://spring.io/projects/spring-boot)
[![Postgres](https://img.shields.io/badge/postgres-v42.3.0-blue)](https://www.postgresql.org/)
[![RabbitMQ](https://img.shields.io/badge/rabbitmq-v5.8.0-orange)](https://www.rabbitmq.com/)
[![Docker](https://img.shields.io/badge/docker-20.10.7-blue)](https://www.docker.com/)

  <img src="https://github.com/devicons/devicon/blob/master/icons/spring/spring-original-wordmark.svg" title="SpringBoot" alt="SpringBoot" width="40" height="40"/>&nbsp;
  <img src="https://github.com/devicons/devicon/blob/master/icons/postgresql/postgresql-original-wordmark.svg" title="postgres" alt="postgres" width="40" height="40"/>&nbsp;
  <img src="https://github.com/devicons/devicon/blob/master/icons/rabbitmq/rabbitmq-original-wordmark.svg" title="rabbitmq" alt="rabbitmq" width="40" height="40"/>&nbsp;
  <img src="https://github.com/devicons/devicon/blob/master/icons/docker/docker-original-wordmark.svg"  title="docker" alt="docker" width="40" height="40"/>&nbsp;

## Introduction 💬

The Reports Microservice is a powerful tool designed to generate various reports related to time tracking, project progress, team productivity, and other metrics. This microservice is part of the Hubstaff ecosystem and helps users analyze performance and efficiency across different modules like time tracking, payments, and project management.

## Purpose and Functionality 🎯

- **Data Aggregation:** Collects data from various modules within Hubstaff to present meaningful insights.
- **Detailed Reports:** Allows users to create detailed reports for performance and efficiency analysis.
- **Comprehensive Metrics:** Covers time tracking, project progress, team productivity, and more.

## Types of Reports Implemented 📊

### 1. Work Session Reports
Displays and/or downloads timer start and stop data for yourself or your team. Specific details for each session include:
- Clients
- Projects
- Members
- To-dos/Jobs
- Manual time tracked
- Session duration
- Activity levels

### 2. Time and Activity Reports
Provides detailed information on:
- Time spent on projects and tasks
- Activity levels
- Total pay and bill amounts
- Idle time

### 3. Weekly Limit Reports
Shows information about user weekly limits.

### 4. Payments Reports
Displays payment information over a selected period, including:
- Date ranges
- Projects
- Members
- Amount paid to each person
- Total amount paid

### 5. Project Budget Reports
Shows how much of your set budget has been used by your team or a specific project.

### 6. Client Budget Reports
Tracks budget usage per client in terms of total hours or total costs.

### 7. Amounts Owed Reports
Displays how much members are owed over a given period.

## Example Use Cases 🌟
### 1. Project Managers 📊:
Use time and activity reports to monitor project progress, allocate resources more effectively, and ensure deadlines are met.
### 2. HR and Payroll 💸:
Utilize time reports to calculate payroll accurately and ensure compliance with labor regulations.
### 3. Freelancers and Contractors 🖋️:
Generate billing reports to invoice clients accurately based on the time spent on their projects.
### 4. Business Owners 🎯:
Analyze productivity reports to identify high-performing team members and areas that need improvement.

## Technologies Used
  
This project leverages a variety of tools and technologies to ensure robust and efficient performance:

- **Spring Boot:** For building and running the microservice.
- **Postgres:** As the relational database for storing and managing data.
- **RabbitMQ:** For reliable messaging between services.
- **Docker:** To containerize the application, ensuring consistency across different environments.
