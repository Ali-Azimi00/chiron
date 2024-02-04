package com.genie.chiron.models;


import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskId;

    @Column ( nullable = false )
    private boolean isActive;

    private String taskName;

    private int taskMinCount;

    private  String taskUnit;

    @ManyToMany
    private List<Category> taskCategory;




}
