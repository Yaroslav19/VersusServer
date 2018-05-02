package com.versus.server.service.impl;

import com.versus.server.dao.entity.User;
import com.versus.server.dao.repository.UserRepository;
import com.versus.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getByID(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void save(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);
    }
}
