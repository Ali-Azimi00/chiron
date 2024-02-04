package com.genie.chiron.controllers;

import com.genie.chiron.models.Experience;
import com.genie.chiron.services.ExpService;
import com.genie.chiron.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("exp")
@RequiredArgsConstructor
public class ExperienceController {
    private final ExpService expService;

    @PostMapping("{id}")
    public void addExperienceHandler(@RequestBody Experience exp,
                                     @PathVariable("id") int id
    ){
        expService.addExperience(exp, id);
    }
}
