package com.genie.chiron.models;

import javax.persistence.*;

@Entity
@Table(name="Stats")
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
}