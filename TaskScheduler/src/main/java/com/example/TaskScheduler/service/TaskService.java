package com.example.TaskScheduler.service;

import com.example.TaskScheduler.entity.Task;
import com.example.TaskScheduler.enums.Status;
import com.example.TaskScheduler.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public void updateTaskStatus(){
        List<Task> tasks = taskRepository.findAll();
        for(Task task : tasks){
            switch (task.getStatus()){
                case PENDING -> task.setStatus(Status.IN_PROGRESS);
                case IN_PROGRESS -> task.setStatus(Status.REVIEW);
                case REVIEW -> task.setStatus(Status.COMPLETED);
                case COMPLETED -> {}
            }
            taskRepository.save(task);
        }
    }
}
