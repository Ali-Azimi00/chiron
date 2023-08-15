package com.genie.chiron.daos;

import com.genie.chiron.models.StatLevels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatsDAO extends JpaRepository<StatLevels, Integer> {
}
