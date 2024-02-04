package com.genie.chiron.services;

import com.genie.chiron.daos.ExperienceDAO;
import com.genie.chiron.daos.PersonDAO;
import com.genie.chiron.models.Experience;
import com.genie.chiron.models.Person;
import com.genie.chiron.models.Stats;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonDAO personDAO;
    private final ExperienceDAO experienceDAO;
    private final TaskService taskService;

    public Person createPerson(Person person) {
        Person p = person;
        Stats s = new Stats(1,1);
        p.setLevel(101);
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


}
