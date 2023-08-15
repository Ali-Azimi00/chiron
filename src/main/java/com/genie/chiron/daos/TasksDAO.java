package com.genie.chiron.daos;

import com.genie.chiron.models.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksDAO extends JpaRepository<Tasks, Integer> {


}
