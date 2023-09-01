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

    @Column(name="completedQty")
    private int completedQty;

    @ManyToOne
    private Tasks tasks;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    public Experience() {
    }
    public Experience(Tasks tasks, LocalDate date) {
        this.tasks = tasks;
        this.date = date;
    }


    public Experience(int experienceId, Tasks tasks, LocalDate date) {
        this.experienceId = experienceId;
        this.tasks = tasks;
        this.date = date;
    }

    public Experience(int experienceId, int completedQty, Tasks tasks, LocalDate date) {
        this.experienceId = experienceId;
        this.completedQty = completedQty;
        this.tasks = tasks;
        this.date = date;
    }

    public int getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(int experienceId) {
        this.experienceId = experienceId;
    }

    public int getCompletedQty() {
        return completedQty;
    }

    public void setCompletedQty(int completedQty) {
        this.completedQty = completedQty;
    }

    public Tasks getTasks() {
        return tasks;
    }

    public void setTasks(Tasks tasks) {
        this.tasks = tasks;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "experienceId=" + experienceId +
                ", tasks=" + tasks +
                ", date=" + date +
                '}';
    }
}
