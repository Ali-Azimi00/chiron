package com.genie.chiron.daos;

import com.genie.chiron.models.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceDAO extends JpaRepository<Experience,Integer> {
}
