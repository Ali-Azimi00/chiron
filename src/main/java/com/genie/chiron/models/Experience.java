package com.genie.chiron.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name="Experience")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int experienceId;

    @Column (name="completedTask")
    private String completedTask;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;


}
