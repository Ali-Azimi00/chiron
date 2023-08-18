package com.genie.chiron.models;

import javax.persistence.*;

@Entity
@Table(name="StatLevels")
public class StatLevels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int statId;
    @Column(name = "strengthLevel")
    private int strengthLevel;
    @Column(name = "strengthExp")
    private int strengthExp;

    @Column(name = "speedLevel")
    private int speedLevel;
    @Column(name = "speedExp")
    private int speedExp;

    @Column(name = "staminaLevel")
    private int staminaLevel;
    @Column(name = "staminaExp")
    private int staminaExp;

    @Column(name = "intelligenceLevel")
    private int intelligenceLevel;
    @Column(name = "intelligenceExp")
    private int intelligenceExp;

    @Column(name = "dexterityLevel")
    private int dexterityLevel;
    @Column(name = "dexterityExp")
    private int dexterityExp;

    @Column(name = "spiritLevel")
    private int spiritLevel;
    @Column(name = "spiritExp")
    private int spiritExp;

    public StatLevels() {
    }
    public StatLevels(int strengthLevel, int strengthExp, int speedLevel, int speedExp, int staminaLevel, int staminaExp, int intelligenceLevel, int intelligenceExp, int dexterityLevel, int dexterityExp, int spiritLevel, int spiritExp) {
        this.strengthLevel = strengthLevel;
        this.strengthExp = strengthExp;
        this.speedLevel = speedLevel;
        this.speedExp = speedExp;
        this.staminaLevel = staminaLevel;
        this.staminaExp = staminaExp;
        this.intelligenceLevel = intelligenceLevel;
        this.intelligenceExp = intelligenceExp;
        this.dexterityLevel = dexterityLevel;
        this.dexterityExp = dexterityExp;
        this.spiritLevel = spiritLevel;
        this.spiritExp = spiritExp;
    }
    public StatLevels(int statId, int strengthLevel, int strengthExp, int speedLevel, int speedExp, int staminaLevel, int staminaExp, int intelligenceLevel, int intelligenceExp, int dexterityLevel, int dexterityExp, int spiritLevel, int spiritExp) {
        this.statId = statId;
        this.strengthLevel = strengthLevel;
        this.strengthExp = strengthExp;
        this.speedLevel = speedLevel;
        this.speedExp = speedExp;
        this.staminaLevel = staminaLevel;
        this.staminaExp = staminaExp;
        this.intelligenceLevel = intelligenceLevel;
        this.intelligenceExp = intelligenceExp;
        this.dexterityLevel = dexterityLevel;
        this.dexterityExp = dexterityExp;
        this.spiritLevel = spiritLevel;
        this.spiritExp = spiritExp;
    }

    public int getStatId() {
        return statId;
    }

    public void setStatId(int statId) {
        this.statId = statId;
    }

    public int getStrengthLevel() {
        return strengthLevel;
    }

    public void setStrengthLevel(int strengthLevel) {
        this.strengthLevel = strengthLevel;
    }

    public int getStrengthExp() {
        return strengthExp;
    }

    public void setStrengthExp(int strengthExp) {
        this.strengthExp = strengthExp;
    }

    public int getSpeedLevel() {
        return speedLevel;
    }

    public void setSpeedLevel(int speedLevel) {
        this.speedLevel = speedLevel;
    }

    public int getSpeedExp() {
        return speedExp;
    }

    public void setSpeedExp(int speedExp) {
        this.speedExp = speedExp;
    }

    public int getStaminaLevel() {
        return staminaLevel;
    }

    public void setStaminaLevel(int staminaLevel) {
        this.staminaLevel = staminaLevel;
    }

    public int getStaminaExp() {
        return staminaExp;
    }

    public void setStaminaExp(int staminaExp) {
        this.staminaExp = staminaExp;
    }

    public int getIntelligenceLevel() {
        return intelligenceLevel;
    }

    public void setIntelligenceLevel(int intelligenceLevel) {
        this.intelligenceLevel = intelligenceLevel;
    }

    public int getIntelligenceExp() {
        return intelligenceExp;
    }

    public void setIntelligenceExp(int intelligenceExp) {
        this.intelligenceExp = intelligenceExp;
    }

    public int getDexterityLevel() {
        return dexterityLevel;
    }

    public void setDexterityLevel(int dexterityLevel) {
        this.dexterityLevel = dexterityLevel;
    }

    public int getDexterityExp() {
        return dexterityExp;
    }

    public void setDexterityExp(int dexterityExp) {
        this.dexterityExp = dexterityExp;
    }

    public int getSpiritLevel() {
        return spiritLevel;
    }

    public void setSpiritLevel(int spiritLevel) {
        this.spiritLevel = spiritLevel;
    }

    public int getSpiritExp() {
        return spiritExp;
    }

    public void setSpiritExp(int spiritExp) {
        this.spiritExp = spiritExp;
    }

    @Override
    public String toString() {
        return "StatLevels{" +
                "statId=" + statId +
                ", strengthLevel=" + strengthLevel +
                ", strengthExp=" + strengthExp +
                ", speedLevel=" + speedLevel +
                ", speedExp=" + speedExp +
                ", staminaLevel=" + staminaLevel +
                ", staminaExp=" + staminaExp +
                ", intelligenceLevel=" + intelligenceLevel +
                ", intelligenceExp=" + intelligenceExp +
                ", dexterityLevel=" + dexterityLevel +
                ", dexterityExp=" + dexterityExp +
                ", spiritLevel=" + spiritLevel +
                ", spiritExp=" + spiritExp +
                '}';
    }
}