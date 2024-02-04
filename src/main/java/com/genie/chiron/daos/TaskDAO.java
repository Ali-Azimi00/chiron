package com.genie.chiron.daos;

import com.genie.chiron.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface TaskDAO extends JpaRepository<Task, Integer> {
    Task findByTaskName(String name);

    Task findByTaskId(int id);

    @Query(
            value ="SELECT * FROM task t  " +
                    "FULL JOIN task_task_category ttc ON t.task_id = ttc.task_task_id " +
                    "FULL JOIN category c ON c.category_id = ttc.task_category_category_id " +
                    "WHERE category_type = :categoryType",
            nativeQuery = true
    )
    List<Task> findAllTasksByCategoryType(@Param("categoryType") String categoryType);

     @Query(
                value ="SELECT * FROM task t  " +
                        "FULL JOIN task_task_category ttc ON t.task_id = ttc.task_task_id " +
                        "FULL JOIN category c ON c.category_id = ttc.task_category_category_id " +
                        "WHERE is_active = :active",
                nativeQuery = true
        )
        List<Task> findAllTasksByActiveStatus(@Param("active") boolean active);


}
