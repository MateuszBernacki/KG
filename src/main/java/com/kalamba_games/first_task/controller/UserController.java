package com.kalamba_games.first_task.controller;

import com.kalamba_games.first_task.dto.UserDTO;
import com.kalamba_games.first_task.form.Form;
import com.kalamba_games.first_task.service.UserService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Log
@Controller
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/menuUser")
    public String GetMenuUser(){
        return "user/menuUser.html";
    }

    @GetMapping("allUSers")
    public String getUsers(Model model){
        List<UserDTO> user =service.getUsers();
            model.addAttribute(user);
            return "user/allUsers.html";
    }

    @GetMapping("/addUser")
    public String addUser(){
        return "user/addUser.html";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute Form form, Model model){
        UserDTO user = service.createUser(form);
        model.addAttribute("userName",user);
        return "user/menuUser.html";
    }

    @GetMapping("/getUser/{userName}")
    public String getUser(@PathVariable("userName") String userName, Model model){
        UserDTO user = service.getUser(userName);
        model.addAttribute(user);
        return "user/user.html";
    }
}
