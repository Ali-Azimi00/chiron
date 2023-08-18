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
    public List<Experience> getAllExpByIdHandler(@PathVariable("id") int avatarId){
        return experienceService.getAllExperiencesById(avatarId);
    }

    @GetMapping("{id}/date")
    public List<Experience> getAllExpDByDateHandler(@PathVariable("id") int avatarId, @RequestBody LocalDate date){
        return experienceService.getAllExperiencesByDate(avatarId,date);
    }

//    @GetMapping("{id}/dateRange")
//    public List<Experience> getAllExpDByDateHandler(@PathVariable("id") int avatarId,
//                                                    @RequestBody LocalDate startDate,
//                                                    @RequestBody LocalDate endDate){
//        return experienceService.getAllExperiencesByDateRange(avatarId,startDate,endDate);
//    }

    @PostMapping("{id}/task/{taskId}")
    public List<Experience> createExperienceHandler(@PathVariable("id") int avatarId, @PathVariable("taskId") int taskId){
        return experienceService.createExperience(avatarId, taskId);
    }




}
