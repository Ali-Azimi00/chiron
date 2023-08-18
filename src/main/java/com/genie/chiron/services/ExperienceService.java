package com.genie.chiron.services;

import com.genie.chiron.daos.AvatarDAO;
import com.genie.chiron.daos.ExperienceDAO;
import com.genie.chiron.daos.TasksDAO;
import com.genie.chiron.models.Avatar;
import com.genie.chiron.models.Experience;
import com.genie.chiron.models.Tasks;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ExperienceService {

    private final ExperienceDAO experienceDAO;
    private final TasksDAO tasksDAO;
    private final AvatarDAO avatarDAO;

    public ExperienceService(ExperienceDAO experienceDAO, TasksDAO tasksDAO, AvatarDAO avatarDAO) {
        this.experienceDAO = experienceDAO;
        this.tasksDAO = tasksDAO;
        this.avatarDAO = avatarDAO;
    }

    //TODO DATERANGE
//    public List<Experience> getAllExperiencesByDateRange(int avatarId,LocalDate startDate,LocalDate endDate ){
//        return experienceDAO.findAllExpereincesByDateRange(avatarId,startDate,endDate);
//    }

    public List<Experience> getAllExperiencesById(int avatarId){
        return experienceDAO.findAllExpereincesById(avatarId);
    }

    public List<Experience> getAllExperiencesByDate(int avatarId, LocalDate date) {
        List<Experience> eList = experienceDAO.findAllExpereincesByDate(date,avatarId);
        return experienceDAO.findAllExpereincesByDate(date,avatarId);
    }

    public List<Experience> createExperience(int avatarId, int taskId) {
        Avatar a = avatarDAO.findById(avatarId).get();
        Tasks t = tasksDAO.findById(taskId).get();

        Experience e = new Experience();
        e.setDate(LocalDate.now());
        e.setTasks(t);
        experienceDAO.save(e);

        List<Experience> eList = a.getExperience();
        eList.add(e);

        a.setExperience(eList);
        avatarDAO.save(a);

        return eList;
    }
}
