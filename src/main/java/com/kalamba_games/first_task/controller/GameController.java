package com.kalamba_games.first_task.controller;

import com.kalamba_games.first_task.dto.GameDTO;
import com.kalamba_games.first_task.form.Form;
import com.kalamba_games.first_task.service.GameService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log
@Controller
public class GameController {

    @Autowired
    GameService service;

    @GetMapping("/menuGame")
    public String getMenuGames() {
        return "game/menuGame.html";
    }

    @GetMapping("/allGames")
    public String getGames(Model model) {
        List<GameDTO> games = service.gamesList();
        model.addAttribute(games);
        return "game/allGames.html";
    }

    @GetMapping("/addGame")
    public String addGame() {
        return "game/addGame.html";
    }


    @PostMapping("/addGame")
    public String addGame(@ModelAttribute Form form, Model model) {
        GameDTO addGame = service.createGame(form);
        model.addAttribute("gameName", addGame);
        return "game/menuGame.html";
    }

    @GetMapping("/getGame/{gameName}")
    public String getGame(@PathVariable("gameName") String gameName, Model model){
    GameDTO game = service.getGame(gameName);
    model.addAttribute(game);
    return "game/game.html";
    }



}
