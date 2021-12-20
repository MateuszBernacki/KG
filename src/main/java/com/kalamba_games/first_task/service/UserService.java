package com.kalamba_games.first_task.service;

import com.kalamba_games.first_task.dto.UserDTO;
import com.kalamba_games.first_task.entity.UserEntity;
import com.kalamba_games.first_task.form.Form;
import com.kalamba_games.first_task.mapper.UserMapper;
import com.kalamba_games.first_task.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserDTO> getUsers() {
        List<UserEntity> users = userRepository.findAll();
        return UserMapper.userListMap(users);
    }

    public UserDTO getUser(String userName) {
        UserEntity user = userRepository.findAllByUserName(userName);
        return UserMapper.userMap(user);
    }

    public UserDTO createUser(Form form) {
        UserEntity user = new UserEntity()
                .setUserName(form.getGameName());

        UserEntity entity = userRepository.saveAndFlush(user);

        return UserMapper.userMap(entity);
    }

    public UserDTO updateUser(UserEntity entity) {
        UserEntity user = userRepository.saveAndFlush(entity);
        return UserMapper.userMap(user);
    }

    public void deleteStudent(Long id) {
        userRepository.deleteById(String.valueOf(id));
    }
}
