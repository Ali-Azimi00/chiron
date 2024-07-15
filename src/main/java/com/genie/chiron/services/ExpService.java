package com.genie.chiron.services;

import com.genie.chiron.daos.ExperienceDAO;
import com.genie.chiron.daos.PersonDAO;
import com.genie.chiron.daos.TaskDAO;
import com.genie.chiron.models.Experience;
import com.genie.chiron.models.Person;
import com.genie.chiron.models.Task;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Slf4j
@Service
@AllArgsConstructor
public class ExpService {

    private final PersonDAO personDAO;
    private final ExperienceDAO experienceDAO;
    private final TaskDAO taskDAO;

    public void addExperience(Experience e, int personId){
        List<Experience> todayExpList = getExpToday(personId);
        Map<Integer,Integer> expMap = new HashMap<>();

        todayExpList.forEach((exp)->{
            expMap.put(
                    exp.getTask().getTaskId(),
                    exp.getExpId());
        });


        Person p = personDAO.findByUserId(personId);
        Experience exp = e;
        log.info("addedExpTask: {}", exp.toString());
        Task t = taskDAO.getReferenceById(e.getTask().getTaskId());
        List<Experience> expList = p.getExperienceList();
        log.info("ExpList: {}", expList.toString());

        if(expMap.containsKey(t.getTaskId())) {
            Experience todayExp = experienceDAO.getReferenceById(expMap.get(t.getTaskId()));
            todayExp.setExpCount(e.getExpCount());

            experienceDAO.save(exp);
        }
        else{
            exp.setDate(LocalDate.now());
            exp.setTask(t);
            expList.add(exp);

            experienceDAO.save(exp);
            personDAO.save(p);
        }
    }

    public List<Experience> getAllExperience(int personId){
        Person p = personDAO.findByUserId(personId);
        List<Experience> expList = p.getExperienceList();
        return expList;
    }

    public Experience getExpLatest(int personId){
        Person p = personDAO.findByUserId(personId);
        List<Experience> expList = p.getExperienceList();
        Experience exp = expList.get(expList.size()-1);

        return exp;
    }

    public List<Experience> getExpToday(int personId){
        Person p = personDAO.findByUserId(personId);
        String localDate = LocalDate.now().toString();

        List<Experience> expList = new ArrayList<>();

        p.getExperienceList().forEach((exp)->{
            String expDate = exp.getDate().toString();

            if (expDate.equals(localDate)) {
                expList.add(exp);
            }
        });

        return expList;
    }

}
