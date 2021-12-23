package com.kalamba_games.first_task;

import com.kalamba_games.first_task.dto.GameDTO;
import com.kalamba_games.first_task.dto.UserDTO;
import com.kalamba_games.first_task.form.Form;
import com.kalamba_games.first_task.service.GameService;
import com.kalamba_games.first_task.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);



	}

}
