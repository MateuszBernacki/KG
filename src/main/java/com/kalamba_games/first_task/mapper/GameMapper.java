package com.kalamba_games.first_task.mapper;

import com.kalamba_games.first_task.dto.GameDTO;
import com.kalamba_games.first_task.entity.GameEntity;

import java.util.List;
import java.util.stream.Collectors;

public class GameMapper {

    public static GameDTO gameMap(GameEntity gameEntity) {
        return new GameDTO().setGameName(gameEntity.getGameName());
    }

    public static List<GameDTO> gameListMap(List<GameEntity> entities) {
        return entities.stream().map(GameMapper::gameMap).collect(Collectors.toList());
    }
}
