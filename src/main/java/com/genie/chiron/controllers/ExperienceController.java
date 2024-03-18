package com.genie.chiron.controllers;

import com.genie.chiron.models.Experience;
import com.genie.chiron.services.ExpService;
import com.genie.chiron.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;


@RestController
@RequestMapping("exp")
@CrossOrigin(origins = {"http://localhost:5173"})
@RequiredArgsConstructor
public class ExperienceController {
    private final ExpService expService;


   @GetMapping("person/{id}")
   public Experience getExpLatestHandler( @PathVariable("id") int id){
     return expService.getExpLatest(id);
   }

    @PostMapping("{id}")
    public void addExperienceHandler(@RequestBody Experience exp,
                                     @PathVariable("id") int id
    ){
        expService.addExperience(exp, id);
    }
}
