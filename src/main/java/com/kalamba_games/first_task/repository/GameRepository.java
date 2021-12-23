package com.kalamba_games.first_task.repository;

import com.kalamba_games.first_task.entity.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<GameEntity, String> {
    GameEntity findAllByGameName(String gameName);
    GameEntity findById(Long id);
}
