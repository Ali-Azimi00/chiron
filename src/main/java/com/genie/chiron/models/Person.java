package com.genie.chiron.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String name;

    private int level;

    @OneToOne
    private Stats stats;

    @ManyToMany
    private List<Task> taskList;

    @OneToMany
    private List<Experience> experienceList;

    public Person(String name, int level, Stats stats, List<Experience> experienceList) {
        this.name = name;
        this.level = level;
        this.stats = stats;
        this.experienceList = experienceList;
    }




}
