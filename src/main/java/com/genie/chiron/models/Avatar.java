package com.genie.chiron.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Avatar")
public class Avatar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int avatarId;

    @Column(name="userName", unique = true)
    private String userName;

    @Column(name="level")
    private int level;

    @Column(name="exPoints")
    private int exp;

    @Column(name="hitPoints")
    private int hp;

    @OneToMany
    private List<Experience> experience;

    @OneToOne
    private StatLevels statLevels;

    public Avatar() {
    }

    public Avatar(String userName, int level, int exp, int hp, StatLevels statLevels) {
        this.userName = userName;
        this.level = level;
        this.exp = exp;
        this.hp = hp;
        this.statLevels = statLevels;
    }

    public Avatar(int characterId, String userName, int level, int exp, int hp, StatLevels statLevels) {
        this.avatarId = characterId;
        this.userName = userName;
        this.level = level;
        this.exp = exp;
        this.hp = hp;
        this.statLevels = statLevels;
    }

    public int getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(int avatarId) {
        this.avatarId = avatarId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    public StatLevels getStats() {
        return statLevels;
    }

    public void setStats(StatLevels statLevels) {
        this.statLevels = statLevels;
    }

    @Override
    public String toString() {
        return "Avatar{" +
                "avatarId=" + avatarId +
                ", userName='" + userName + '\'' +
                ", level=" + level +
                ", exp=" + exp +
                ", hp=" + hp +
                ", experience=" + experience +
                ", statLevels=" + statLevels +
                '}';
    }
}
