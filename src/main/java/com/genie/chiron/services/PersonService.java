package com.genie.chiron.services;

import com.genie.chiron.daos.ExperienceDAO;
import com.genie.chiron.daos.PersonDAO;
import com.genie.chiron.daos.StatsDAO;
import com.genie.chiron.models.Experience;
import com.genie.chiron.models.Person;
import com.genie.chiron.models.Stats;
import com.genie.chiron.models.Task;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class PersonService {

    private final PersonDAO personDAO;
    private final StatsDAO statsDAO;
    private final ExperienceDAO experienceDAO;
    private final TaskService taskService;

    public Person createPerson(Person person) {
        Person p = person;
        Stats s = new Stats(1,1,1,1);
        statsDAO.save(s);

        p.setLevel(1);
        p.setStats(s);
        return personDAO.save(p);
    }

    public Person getPersonById(int id){
        return personDAO.findByUserId(id);
    }

    public Person updatePersonById(Person person, int id) {
        Person p = personDAO.findByUserId(id);
        p.setName(person.getName());

        return personDAO.save(p);
    }

    //Task CRUDS
    public List<Task> getAllPersonTasks(int id) {
        Person p=personDAO.findByUserId(id);
        return p.getTaskList();
    }
    public List<Task>  addTaskToPerson(int id, int taskId) {
        Person p = personDAO.findByUserId(id);
        List<Task> tList = p.getTaskList();
        Task t = taskService.findTaskById(taskId);

        if(!tList.contains(t)){
            p.setTaskList(tList);
            tList.add(t);
            personDAO.save(p);
            log.info("Successfully added Task:{}", t);

        }
        else{
            log.info("Task - {} - is already assigned to {}. No change was made ",
                    t.getTaskName(),p.getName());

        }

        return tList;
    }
     public List<Task>  removeTaskFromPerson(int id, int taskId) {
        Person p = personDAO.findByUserId(id);
        List<Task> tList = p.getTaskList();
        Task t = taskService.findTaskById(taskId);

        if(tList.contains(t)){
            p.setTaskList(tList);
            tList.remove(t);
            personDAO.save(p);
            log.info("Successfully removed Task:{}", t);
        }
        else{
            log.info("Task - {} - was not assigned to {}. No change was made ",
                    t.getTaskName(),p.getName());

        }

        return tList;
    }



}
