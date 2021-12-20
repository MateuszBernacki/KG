package com.kalamba_games.first_task.mapper;

import com.kalamba_games.first_task.dto.UserDTO;
import com.kalamba_games.first_task.entity.UserEntity;

import java.util.List;
import java.util.stream.Collectors;

public class UserMapper {

    public static UserDTO userMap(UserEntity userEntity) {
        return new UserDTO().setUserName(userEntity.getUserName());
    }

    public static List<UserDTO> userListMap(List<UserEntity> entities) {
        return entities.stream().map(UserMapper::userMap).collect(Collectors.toList());
    }
}
