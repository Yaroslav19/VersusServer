package com.versus.server.controller;

import com.versus.server.dao.entity.User;
import com.versus.server.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping()
    public List<User> getAllReminders() {
        return userService.getAll();
    }

    @GetMapping(value = "/{id}")
    public User getReminder(@PathVariable("id") Long userId) {
        return userService.getByID(userId);
    }

    @PostMapping()
    public void saveUser(@RequestBody User user) {
        userService.save(user);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long userId) {
        userService.remove(userId);
    }
}
