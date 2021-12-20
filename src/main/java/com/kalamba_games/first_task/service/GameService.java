package com.kalamba_games.first_task.service;

import com.kalamba_games.first_task.dto.GameDTO;
import com.kalamba_games.first_task.entity.GameEntity;
import com.kalamba_games.first_task.form.Form;
import com.kalamba_games.first_task.mapper.GameMapper;
import com.kalamba_games.first_task.repository.CRUDRepository;
import com.kalamba_games.first_task.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;
    @Autowired
    CRUDRepository crudRepository;

    public List<GameDTO> gamesList() {
        List<GameEntity> games = gameRepository.findAll();
        return GameMapper.gameListMap(games);
    }

    public GameDTO getGame(String gameName) {
        GameEntity game = gameRepository.findAllByGameName(gameName);
        return GameMapper.gameMap(game);
    }

    public GameDTO createGame(Form form) {
        GameEntity game = new GameEntity()
                .setGameName(form.getGameName());
        GameEntity entity = gameRepository.saveAndFlush(game);
        crudRepository.save(entity);
        return GameMapper.gameMap(entity);
    }

    public GameDTO updateGame(GameEntity entity) {
        GameEntity gameEntity = gameRepository.saveAndFlush(entity);
        return GameMapper.gameMap(gameEntity);
    }

    public void delateGame(Long id) {
        gameRepository.deleteById(String.valueOf(id));
    }

}
