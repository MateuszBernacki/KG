package com.kalamba_games.first_task.form;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Form {

    @NotNull(message= "Not correct name")
    @Size(min = 2, message = "Name is to short")
    private String gameName;

    public String getGameName() {
        return gameName;
    }


    public Form setGameName(String gameName) {
        this.gameName = gameName;
        return this;
    }

    public Form(String name) {
        this.gameName = name;
    }

    @Override
    public String toString() {
        return "form{" +
                "name='" + gameName + '\'' +
                '}';
    }
}
