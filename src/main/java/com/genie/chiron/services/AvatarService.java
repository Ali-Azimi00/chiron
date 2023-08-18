package com.genie.chiron.services;

import com.genie.chiron.daos.AvatarDAO;
import com.genie.chiron.daos.StatsDAO;
import com.genie.chiron.models.Avatar;
import com.genie.chiron.models.StatLevels;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvatarService {

    private final AvatarDAO avatarDAO;
    private final StatsDAO statsDAO;
    public AvatarService(AvatarDAO avatarDAO, StatsDAO statsDAO) {
        this.avatarDAO = avatarDAO;
        this.statsDAO = statsDAO;
    }

    public List<Avatar> getAllAvatars() {
        return avatarDAO.findAll();
    }

    public Optional<Avatar> getAvatarById(int avatarId) {
        return avatarDAO.findById(avatarId);
    }

    public Avatar createAvatar(String username){
        Avatar a = new Avatar();
        StatLevels s = new StatLevels(1,1,1,1,1,1,1,1,1,1,1,1);
        System.out.println("stat levels: "+ s);

        a.setUserName(username);
        a.setLevel(1);
        a.setExp(0);
        a.setStats(s);

        statsDAO.save(s);

        return avatarDAO.save(a);
    };

    public StatLevels getAvatarStats(int avatarId) {
        return null;
    }


//    List<Avatar> getAllAvatars() {
//
//
//    }
//
}
