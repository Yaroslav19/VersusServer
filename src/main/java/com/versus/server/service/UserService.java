package com.versus.server.service;

import com.versus.server.dao.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getByID(Long id);

    User save(User user);

    void remove(Long id);
}
