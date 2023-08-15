package com.genie.chiron.controllers;

import com.genie.chiron.models.Avatar;
import com.genie.chiron.services.AvatarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("avatar")
@CrossOrigin(origins = {"http://localhost:3000"})
public class AvatarController {

    private final AvatarService avatarService;

    public AvatarController(AvatarService avatarService) {
        this.avatarService = avatarService;
    }

    @GetMapping
    public List<Avatar> getAllAvatarsHandler(){
        return avatarService.getAllAvatars();
    }

    @GetMapping("{id}")
    public Optional<Avatar> getAvatarByIdHandler(@PathVariable("id") int avatarId){
        return avatarService.getAvatarById(avatarId);
    }

    @PostMapping
    public Avatar createAvatarHandler(@RequestBody String username){
        return avatarService.createAvatar(username);
    }


}
