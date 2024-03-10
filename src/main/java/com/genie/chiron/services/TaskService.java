package com.genie.chiron.services;

import com.genie.chiron.daos.CategoryDAO;
import com.genie.chiron.daos.TaskDAO;
import com.genie.chiron.models.Category;
import com.genie.chiron.models.Task;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class TaskService {

    private final TaskDAO taskDAO;
    private final CategoryDAO categoryDAO;



    public Task findTaskById(int id) {
        return taskDAO.findByTaskId(id);
    }

    public Task findTaskByTaskName(String tName){
        return taskDAO.findByTaskName(tName);
    }

    public List<Task> findAllByTaskCategory(String category){
        return taskDAO.findAllTasksByCategoryType(category);
    }
    public List<Task> findAllByActiveStatus(boolean active){
        return taskDAO.findAllTasksByActiveStatus(active);
    }

//    public Task findByTaskName(String name) {
//        return taskDAO.findByTaskName(name);
//    }

    public Task postTask(Task task){
        Task t = task;
        taskDAO.save(t);
        return taskDAO.findByTaskId(task.getTaskId());
    }



//    public Task updateTaskById(int id, Task task) {
//        Task t = taskDAO.getReferenceById(id);
//
////        List<Category> c = task.getTaskCategory();
//
//        t.setTaskName(task.getTaskName());
//        t.setTaskMinCount(task.getTaskMinCount());
//        t.setTaskUnit(task.getTaskUnit());
////        t.setTaskCategory(task.getTaskCategory());
//
//        return taskDAO.save(t);
//    }
}
