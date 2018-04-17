package com.versus.server.service;

import com.versus.server.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAll();

    User getByID(Long id);

    User save(User user);

    void remove(Long id);
}
