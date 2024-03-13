package com.genie.chiron.controllers;

import com.genie.chiron.models.Task;
import com.genie.chiron.services.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("task")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:5173"})
//@CrossOrigin(origins = {"http://localhost:3000"})
public class TaskController {

    private final TaskService taskService;


    @GetMapping("{id}")
    public Task findsTaskByIdHandler(@PathVariable("id") int id){
        return taskService.findTaskById(id);
    }
//    @GetMapping("{name}")
//    public Task findsTaskByNameHandler(@PathVariable("name") String name){
//        return taskService.findByTaskName(name);
//    }

    @GetMapping("category/{category}")
    public List<Task> getAllTasks(@PathVariable("category") String category){
        return taskService.findAllByTaskCategory(category);
    }


    @PostMapping
    public Task createTaskHandler(@RequestBody Task task){
        return taskService.postTask(task);
    }

//    @PutMapping("{id}")
//    public Task updateTaskHandler(@PathVariable("id")int id, @RequestBody Task task){
//        return taskService.updateTaskById(id,task);
//    }




}
