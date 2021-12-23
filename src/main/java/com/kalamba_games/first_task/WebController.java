package com.kalamba_games.first_task;

import com.kalamba_games.first_task.dto.GameDTO;
import com.kalamba_games.first_task.dto.UserDTO;
import com.kalamba_games.first_task.entity.GameEntity;
import com.kalamba_games.first_task.entity.UserEntity;
import com.kalamba_games.first_task.form.Form;
import com.kalamba_games.first_task.repository.GameRepository;
import com.kalamba_games.first_task.repository.UserRepository;
import com.kalamba_games.first_task.service.GameService;
import com.kalamba_games.first_task.service.UserService;
import lombok.experimental.Accessors;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@Log
@Controller
public class WebController {

    @Autowired
    GameRepository gameRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/home")
    public String getHome() {
        return "home.html";
    }

    @PutMapping("/{gameId}/user/{userId}")
    public UserEntity gameToUser(
            @PathVariable Long gameId,
            @PathVariable Long userId
    ){
        UserEntity user = userRepository.findById(userId);
        GameEntity game = gameRepository.findById(gameId);
        user.connectGame(game);
        return userRepository.save(user);
    }
}
