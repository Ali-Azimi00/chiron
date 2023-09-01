package com.genie.chiron.services;

import com.genie.chiron.daos.AvatarDAO;
import com.genie.chiron.daos.ExperienceDAO;
import com.genie.chiron.daos.TasksDAO;
import com.genie.chiron.models.Avatar;
import com.genie.chiron.models.Experience;
import com.genie.chiron.models.Tasks;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

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

    public List<Experience> getAllExperiencesByDate(int avatarId, LocalDate date) {
        List<Experience> eList = experienceDAO.findAllExpereincesByDate(date, avatarId);
        return experienceDAO.findAllExpereincesByDate(date, avatarId);
    }

    public List<Experience> getAllExperiencesById(int avatarId) {
        return experienceDAO.findAllExpereincesById(avatarId);
    }

    public Experience getSingleExperience(int avatarId, LocalDate date, int taskId) {
        return experienceDAO.findSingleExperience(date, avatarId, taskId);

    }

    public List<Experience> setExpToZero(int avatarId) {
        LocalDate tDay = LocalDate.now();
        List<Tasks> tList = tasksDAO.findAll();

        Avatar a = avatarDAO.findById(avatarId).get();
        List<Experience> eList = getAllExperiencesById(avatarId);
        List<Experience> todayExp = getAllExperiencesByDate(avatarId, tDay);


        if (tDay.getDayOfWeek().toString() == "THURSDAY" && todayExp == null) {
            for (int i = 0; i < 6; i++) {
                for (int j = 1; j < 5; j++) {
                    Experience e = new Experience();

                    e.setDate(tDay.plusDays(i));
                    e.setCompletedQty(0);
                    Tasks t = tasksDAO.findById(j).get();
                    e.setTasks(t);

                    experienceDAO.save(e);
                    eList.add(e);
                }
            }
        }

        a.setExperience(eList);
        avatarDAO.save(a);

        System.out.println("EList: " + eList);

        return null;

    }

    public Experience updateSingleExp(int avatarId, int taskId, int qty) {
        LocalDate date = LocalDate.now();
        Experience e = experienceDAO.findSingleExperience(date,avatarId,taskId);
        e.setCompletedQty(qty);

        return experienceDAO.save(e);
    }


////
//    public void setFutureExp(int avatarId) {
//        LocalDate tDay = LocalDate.now();
//
//        if(tDay.getDayOfWeek().toString() == "WEDNESDAY"){
//            for (int i = 0; i < 6; i++) {
//                LocalDate testDay = tDay.plusDays(i);
//                System.out.println("Test Day = " + i + "___" + testDay);
//
//                List<Experience> eList = experienceDAO.findAllExpereincesByDate(testDay, avatarId);
//                List<Tasks> tList = tasksDAO.findAll();
//
////            System.out.println(tList.size() + "  " + eList.size());
//
////            while (eList.size() < tList.size()) {
////                System.out.println("This date needs filling: " + testDay + " tList size: " + tList.size());
//                for (int j = 1; j < tList.size() + 1; j++) {
//                    System.out.println("Elist: " + eList.size() + " | TList size: " + tList.size());
//                    if (eList.size() != tList.size()) {
//                        createExperience(avatarId, j, 0, testDay);
//                        System.out.println("tList item " + "| eList :" + eList);
//                    }
//                }
////            }
//            }
//        };
//
//
//    }
//


/////////////////////////////////////////////////////////////////////////////////////////////
}
