package controller;

import models.Task;
import org.springframework.stereotype.Controller;
import services.TaskService;

import java.util.List;

@Controller
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    public String getTasks(){
        List<Task> tasks = taskService.getAllTasks();
        return "tasks";
    }
}
