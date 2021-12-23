package com.kalamba_games.first_task.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


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

    @JsonIgnore
    @ManyToMany(mappedBy = "followedGames")
    List<UserEntity> fallowUser = new ArrayList<>();

    public List<UserEntity> getFallowUser() {
        return fallowUser;
    }

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
