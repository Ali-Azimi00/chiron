package com.genie.chiron.daos;

import com.genie.chiron.models.Stats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatsDAO extends JpaRepository<Stats,Integer> {

}
