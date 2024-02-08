package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//@RestController
//@RequestMapping("/api/tasks")
//@CrossOrigin(origins = "http://localhost:65483") 
//public class TaskController {
//
//    private static final Logger logger = (Logger) LoggerFactory.getLogger(TaskController.class);
//
//    @PostMapping
//    public void createTask(@RequestBody Task task) {
//        // Log the task information
//        logger.info("Task Name: {}", task.getTaskName());
//        logger.info("Task Description: {}", task.getTaskDescription());
//    }
//}





@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "http://localhost:52556") 
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
    	System.out.println(task.getTaskName());
    	System.out.println(task.getTaskDescription());
    	System.out.println(task.getLatitude());
    	System.out.println(task.getLongitude());
        return taskRepository.save(task);
    }
}