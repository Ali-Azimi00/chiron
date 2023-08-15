package com.genie.chiron.models;

import javax.persistence.*;

@Entity
@Table(name="Stats")
public class Stats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int statId;
    @Column(name="strength")
    private int strength;
    @Column(name="speed")
    private int speed;
    @Column(name="stamina")
    private int stamina;
    @Column(name="intelligence")
    private int intelligence;
    @Column(name="dexterity")
    private int dexterity;

    @Column(name="spirit")
    private int spirit;

    public Stats() {
    }

    public Stats(int statId, int strength, int speed, int stamina, int intelligence, int dexterity, int spirit) {
        this.statId = statId;
        this.strength = strength;
        this.speed = speed;
        this.stamina = stamina;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.spirit = spirit;
    }


    public int getStatId() {
        return statId;
    }

    public void setStatId(int statId) {
        this.statId = statId;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }
}
