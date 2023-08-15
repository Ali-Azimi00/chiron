package com.genie.chiron.models;

import javax.persistence.*;

@Entity
@Table(name="Tasks")
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskId;

    @Column(name="taskName")
    private String taskName;

    @Column(name="statName")
    private String statName;

    @Column(name="measureOfTask")
    private String measureOfTask;

    @Column(name="minimumReq")
    private int minReq;

    @Column(name="exPoints")
    private int exPoints;

    @ManyToOne
    private Stats stats;

    public Tasks() {
    }

    public Tasks(int taskId, String taskName, Stats stats, int exPoints) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.stats = stats;
        this.exPoints = exPoints;
    }

    public Tasks(int taskId, String taskName, String measureOfTask, int minReq, int exPoints, Stats stats) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.measureOfTask = measureOfTask;
        this.minReq = minReq;
        this.exPoints = exPoints;
        this.stats = stats;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getMeasureOfTask() {
        return measureOfTask;
    }

    public void setMeasureOfTask(String measureOfTask) {
        this.measureOfTask = measureOfTask;
    }

    public int getMinReq() {
        return minReq;
    }

    public void setMinReq(int minReq) {
        this.minReq = minReq;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public int getExPoints() {
        return exPoints;
    }

    public void setExPoints(int exPoints) {
        this.exPoints = exPoints;
    }


}
