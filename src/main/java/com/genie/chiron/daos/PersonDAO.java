package com.genie.chiron.daos;

import com.genie.chiron.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDAO extends JpaRepository<Person,Integer> {


    Person findByUserId(int id);
}
