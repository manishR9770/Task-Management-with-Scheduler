package com.example.TaskScheduler.scheduler;

import com.example.TaskScheduler.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskStatusScheduler {
    private TaskService taskService;

    @Autowired
    public TaskStatusScheduler(TaskService taskService) {
        this.taskService = taskService;
    }

    //    @Scheduled(cron = "0 * * ? * *")        //every minute
    @Scheduled(cron = "0 0 */6 ? * *")    //every 6 hours
    public void runTaskStatusUpdate() {
        taskService.updateTaskStatus();
    }
}
