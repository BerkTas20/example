package com.example.example.responses;

import com.example.example.entities.User;

public class UserResponse {
    Long id;

    int avatarId;

    String userName;

    public UserResponse(User entity) {
        this.id = entity.getId();
        this.userName = entity.getUserName();
    }
}
