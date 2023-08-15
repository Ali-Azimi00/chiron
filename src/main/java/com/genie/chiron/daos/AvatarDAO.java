package com.genie.chiron.daos;

import com.genie.chiron.models.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvatarDAO extends JpaRepository<Avatar,Integer> {


}
