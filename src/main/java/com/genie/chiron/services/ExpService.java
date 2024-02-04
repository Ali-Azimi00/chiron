package com.genie.chiron.services;

import com.genie.chiron.daos.ExperienceDAO;
import com.genie.chiron.daos.PersonDAO;
import com.genie.chiron.daos.TaskDAO;
import com.genie.chiron.models.Experience;
import com.genie.chiron.models.Person;
import com.genie.chiron.models.Task;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class ExpService {

    private final PersonDAO personDAO;
    private final ExperienceDAO experienceDAO;
    private final TaskDAO taskDAO;

    public void addExperience(Experience e, int personId){
        Person p = personDAO.findByUserId(personId);
        Experience exp = e;
        Task t = taskDAO.getReferenceById(e.getTask().getTaskId());

        List<Experience> expList = p.getExperienceList();
        exp.setDate(LocalDate.now());
        expList.add(exp);
        exp.setTask(t);

        experienceDAO.save(exp);
        personDAO.save(p);
    }



}
