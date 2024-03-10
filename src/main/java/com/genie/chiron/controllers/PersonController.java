package com.genie.chiron.controllers;

import com.genie.chiron.models.Person;
import com.genie.chiron.models.Task;
import com.genie.chiron.services.PersonService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("{id}")
    public Person getPersonByIdHandler(@PathVariable("id") int id){
        return personService.getPersonById(id);
    }

    @PostMapping
    public Person createPersonHandler(@RequestBody Person person){
        return personService.createPerson(person);
    }

    @PutMapping
    public Person updatePersonByIdHandler(@RequestBody Person person){
        return personService.updatePersonById(person, person.getUserId());
    }

    @GetMapping("{id}/task_list")
    public List<Task> getAllPersonTasksHandler(@PathVariable("id") int id){
        return personService.getAllPersonTasks(id);
    }

    @PutMapping("{id}/task_add/{taskId}")
    public List<Task> addTaskToPersonHandler(@PathVariable("id") int id,
                                             @PathVariable("taskId") int taskId){
        return personService.addTaskToPerson(id,taskId);
    }

    @PutMapping("{id}/task_remove/{taskId}")
    public List<Task> removeTaskFromPersonHandler(@PathVariable("id") int id,
                                             @PathVariable("taskId") int taskId){
        return personService.removeTaskFromPerson(id,taskId);
    }



}
