# Task-Management-with-Scheduler
Create a Spring Boot REST API to manage tasks. Each task should have a title, description, and status. You must also implement a scheduler that updates the status of tasks automatically every 6 hours.


Run Locally: Use mvn spring-boot:run

API Endpoints:

create a task - POST: http://localhost:8082/api/tasks

fetch all tasks - GET: http://localhost:8082/api/tasks

Status Update: Automatically handled by scheduler every 6 hours

Sample POST /tasks request body
![AddTask](https://github.com/user-attachments/assets/07b1a013-acae-4c27-afa8-e6a1e7d1631b)

Sample Response for GET /tasks
![GetAllTaskRequest](https://github.com/user-attachments/assets/12a063d5-b63f-4027-8295-16ac554dcf9a)

MySQL-database
![mysql_task](https://github.com/user-attachments/assets/137fffb4-578e-44d7-9348-a3b570ce1fad)

