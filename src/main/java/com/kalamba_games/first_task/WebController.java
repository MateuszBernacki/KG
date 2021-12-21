package com.kalamba_games.first_task;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Log
@Controller
public class WebController {

    @GetMapping("/home")
    public String getHome() {
        return "home.html";
    }
}
