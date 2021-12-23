package com.kalamba_games.first_task.repository;

import com.kalamba_games.first_task.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    UserEntity findAllByUserName(String userName);
    UserEntity findById(Long id);
}
