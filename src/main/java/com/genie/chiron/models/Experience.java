package com.genie.chiron.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="Experience")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int experienceId;

    @Column (name="completedTask")
    private String completedTask;

    @OneToMany
    private List<Tasks> tasks;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    public Experience() {
    }

    public Experience(int experienceId, String completedTask, List<Tasks> tasks, LocalDate date) {
        this.experienceId = experienceId;
        this.completedTask = completedTask;
        this.tasks = tasks;
        this.date = date;
    }

    public int getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(int experienceId) {
        this.experienceId = experienceId;
    }

    public String getCompletedTask() {
        return completedTask;
    }

    public void setCompletedTask(String completedTask) {
        this.completedTask = completedTask;
    }

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
