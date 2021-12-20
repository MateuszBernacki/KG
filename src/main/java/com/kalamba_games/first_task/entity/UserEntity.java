package com.kalamba_games.first_task.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

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
}
