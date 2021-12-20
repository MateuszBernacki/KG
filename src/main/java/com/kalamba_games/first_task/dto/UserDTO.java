package com.kalamba_games.first_task.dto;

import java.util.Objects;

public class UserDTO {
    private String userName;

    public UserDTO(String userName) {
        this.userName = userName;
    }

    public UserDTO() {
    }

    public String getUserName() {
        return userName;
    }

    public UserDTO setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userName='" + userName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(userName, userDTO.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }
}
