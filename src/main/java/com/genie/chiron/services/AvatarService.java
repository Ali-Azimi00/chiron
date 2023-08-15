package com.genie.chiron.services;

import com.genie.chiron.daos.AvatarDAO;
import com.genie.chiron.daos.StatsDAO;
import com.genie.chiron.models.Avatar;
import com.genie.chiron.models.Stats;
import org.springframework.stereotype.Service;

@Service
public class AvatarService {

    private final AvatarDAO avatarDAO;
    private final StatsDAO statsDAO;
    public AvatarService(AvatarDAO avatarDAO, StatsDAO statsDAO) {
        this.avatarDAO = avatarDAO;
        this.statsDAO = statsDAO;
    }

    public Avatar createAvatar(String username){
        Avatar a = new Avatar();
        Stats s = new Stats(1,1,1,1,1,1,1);

        a.setUserName(username);
        a.setLevel(1);
        a.setExp(0);
        a.setStats(s);

        statsDAO.save(s);

        return avatarDAO.save(a);
    };

//    List<Avatar> getAllAvatars() {
//
//
//    }
//
}
