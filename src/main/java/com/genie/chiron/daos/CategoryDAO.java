package com.genie.chiron.daos;

import com.genie.chiron.models.Category;
import com.genie.chiron.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CategoryDAO extends JpaRepository<Category,Integer>{
    List<Category> findAllByCategoryType(String category);
}
