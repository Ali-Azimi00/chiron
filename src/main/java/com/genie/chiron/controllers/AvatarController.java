package com.genie.chiron.controllers;

import com.genie.chiron.models.Avatar;
import com.genie.chiron.services.AvatarService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("avatar")
@CrossOrigin(origins = {"http://localhost:3000"})
public class AvatarController {

    private final AvatarService avatarService;

    public AvatarController(AvatarService avatarService) {
        this.avatarService = avatarService;
    }

//    @GetMapping
//    List<Avatar> getCharacters(){
//        return avatarService.getAllAvatars();
//    }
    @PostMapping
    public Avatar createAvatarHandler(@RequestBody String username){
        return avatarService.createAvatar(username);
    }


}
