package com.genie.chiron.controllers;

import com.genie.chiron.models.Experience;
import com.genie.chiron.models.Tasks;
import com.genie.chiron.services.ExperienceService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("experience")
@CrossOrigin(origins = {"http://localhost:3000"})
public class ExperienceController {

    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping("{id}")
    public List<Experience> getAllExpByIdHandler(@PathVariable("id") int avatarId) {
//        experienceService.setFutureExp(avatarId);
        return experienceService.getAllExperiencesById(avatarId);
    }

    @GetMapping("{id}/date")
    public List<Experience> getAllExpDByDateHandler(@PathVariable("id") int avatarId, @RequestBody LocalDate date) {
        return experienceService.getAllExperiencesByDate(avatarId, date);
    }

    @GetMapping("{id}/date/task/{taskId}")
    public Experience getSingleExperienceHanlder(@PathVariable("id") int avatarId,
                                                 @RequestBody LocalDate date,
                                                 @PathVariable("taskId") int taskId) {
        return experienceService.getSingleExperience(avatarId, date, taskId);
    }

    @PostMapping("{id}/zero")
    public List<Experience> setExpToZeroHandler(@PathVariable("id") int avatarId) {
        return experienceService.setExpToZero(avatarId);
    }


    @PutMapping("{id}/task/{taskId}/quantity/{qty}")
    public Experience updateSingleExpHanlder(@PathVariable("id") int avatarId,
                                             @PathVariable("taskId") int taskId,
                                             @PathVariable("qty") int qty) {
        return experienceService.updateSingleExp(avatarId,taskId,qty);
    }


//    @GetMapping("{id}/dateRange")
//    public List<Experience> getAllExpDByDateHandler(@PathVariable("id") int avatarId,
//                                                    @RequestBody LocalDate startDate,
//                                                    @RequestBody LocalDate endDate){
//        return experienceService.getAllExperiencesByDateRange(avatarId,startDate,endDate);
//    }

//    @PutMapping("{id}/task/{taskId}/completed/{qty}")
//    public List<Experience> updateExperienceHandler(@PathVariable("id") int avatarId,
//                                                    @PathVariable("taskId") int taskId,
//                                                    @PathVariable("qty") int qty){
//
//        LocalDate tDay = LocalDate.now();
//
//        return experienceService.updateExperience(avatarId, taskId,qty,tDay);
//    }

//    @PostMapping("{id}/task/{taskId}/completed/{qty}")
//    public List<Experience> setExperienceHandler(@PathVariable("id") int avatarId,
//                                                    @PathVariable("taskId") int taskId,
//                                                    @PathVariable("qty") int qty){
//
//        LocalDate tDay = LocalDate.now();
//
//        return experienceService.setExperience(avatarId, taskId,qty,tDay);
//    }


}
