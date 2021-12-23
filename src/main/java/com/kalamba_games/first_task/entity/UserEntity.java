package com.kalamba_games.first_task.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@ToString
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "UserName")
    private String userName;

    @ManyToMany
    @JoinTable(
            name = "action",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "game_id")
    )
    private List<GameEntity> followedGames = new ArrayList<>();

    public List<GameEntity> getFollowedGames() {
        return followedGames;
    }

    public String getUserName() {
        return userName;
    }

    public UserEntity setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public Long getId() {
        return id;
    }

    public void connectGame(GameEntity game){
        followedGames.add(game);
    }


}
