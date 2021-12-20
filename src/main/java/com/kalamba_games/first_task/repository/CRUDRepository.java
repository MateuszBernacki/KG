package com.kalamba_games.first_task.repository;

import com.kalamba_games.first_task.entity.GameEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CRUDRepository extends CrudRepository<GameEntity, String> {
}
