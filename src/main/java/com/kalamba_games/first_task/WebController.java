package com.kalamba_games.first_task;

import com.kalamba_games.first_task.dto.GameDTO;
import com.kalamba_games.first_task.dto.UserDTO;
import com.kalamba_games.first_task.entity.UserEntity;
import com.kalamba_games.first_task.form.Form;
import com.kalamba_games.first_task.repository.CRUDRepository;
import com.kalamba_games.first_task.service.GameService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@Log
@Controller
public class WebController {

    @Autowired
    GameService service;


    @GetMapping("/home")
    public String getHome() {
        return "home.html";
    }

    @GetMapping("/menuGame")
    public String getMenuGames() {
        return "menuGame.html";
    }

    @GetMapping("/addGame")
    public String addGame() {
        return "addGame.html";
    }


    @PostMapping("/addGame")
    public String addGame(@ModelAttribute Form form, Model model) {
        GameDTO addGame = service.createGame(form);
        model.addAttribute("gameName", addGame);
        return "menuGame.html";
    }

    @GetMapping("/allGames")
    public String getGames(Model model) {
        List<GameDTO> games = service.gamesList();
        model.addAttribute(games);
        return "allGames.html";
    }
}
