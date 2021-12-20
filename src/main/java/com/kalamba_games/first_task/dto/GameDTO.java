package com.kalamba_games.first_task.dto;

import java.util.Objects;

public class GameDTO {
    private String gameName;

    public GameDTO(String gameName) {
        this.gameName = gameName;
    }

    public GameDTO() {

    }

    public String getGameName() {
        return gameName;
    }

    public GameDTO setGameName(String gameName) {
        this.gameName = gameName;
        return this;
    }

    @Override
    public String toString() {
        return "GameDTO{" +
                "gameName='" + gameName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameDTO gameDTO = (GameDTO) o;
        return Objects.equals(gameName, gameDTO.gameName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameName);
    }
}
