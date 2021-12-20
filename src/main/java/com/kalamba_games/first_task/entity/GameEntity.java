package com.kalamba_games.first_task.entity;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;


@Getter
@ToString
@Entity
@Table(name = "game")
public class GameEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "GameName")
    private String gameName;

    public GameEntity setGameName(String gameName) {
        this.gameName = gameName;
        return this;
    }

    public Long getId() {
        return id;
    }

    public String getGameName() {
        return gameName;
    }
}
