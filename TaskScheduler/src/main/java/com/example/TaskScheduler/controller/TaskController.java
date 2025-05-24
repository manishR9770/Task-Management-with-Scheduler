package com.example.TaskScheduler.controller;

import com.example.TaskScheduler.entity.Task;
import com.example.TaskScheduler.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        Task insertedTask = taskService.createTask(task);
        return new ResponseEntity<>(insertedTask, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks(){
        List<Task> taskList = taskService.getAllTasks();
        return new ResponseEntity<>(taskList,HttpStatus.OK);
    }
}
