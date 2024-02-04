package com.genie.chiron.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class Stats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int statId;

    private int strength;

    private int speed;

    public Stats(int strength, int speed) {
        this.strength = strength;
        this.speed = speed;
    }
}
