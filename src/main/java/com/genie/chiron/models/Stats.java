package com.genie.chiron.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@ToString
@Data
@RequiredArgsConstructor
public class Stats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int statId;

    private int strength; //ability to apply power

    private int agility; //ability to move (speed/flexibility)

    private int intellect; //ability to think/focus

    private int endurance; // ability to keep going

    public Stats(int strength, int agility, int intellect, int endurance) {
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.endurance = endurance;
    }
}
